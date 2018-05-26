package net;

import java.util.ArrayList;
import java.util.List;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/5/25
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */

class Frame {
    private long preamble = 0xaa_aa_aa_aa_aa_aa_aaL;
    private long delimiter = 0xab;
    private long destination = 0x80_00_ff_60_2c_dcL;
    private long source = 0x80_00_fe_85_3a_5fL;
    private int length;
    private String data;
    private String dataBinary;
    private int crc;
    public final static int DATA_MIN_LENGTH = 46;
    public final static int DATA_MAX_LENGTH = 1500;

    private Frame(String data) {
        setData(data);
    }

    public static List<Frame> createFrames(String data) {
        if (Utils.isStrEmpty(data)) {
            return null;
        }

        List<Frame> frames = new ArrayList<>();
        int length = data.length();
        if (length <= DATA_MAX_LENGTH) {
            frames.add(new Frame(data));
        } else {//分帧
            int count = length / DATA_MAX_LENGTH + (length % DATA_MAX_LENGTH == 0 ? 0 : 1);
            int i=0;
            for (; i < count-1; i++) {
                frames.add(new Frame(data.substring(i*DATA_MAX_LENGTH, (i+1)*DATA_MAX_LENGTH)));
            }
            frames.add(new Frame(data.substring(i*DATA_MAX_LENGTH)));
        }

        return frames;
    }

    public String getCheckoutBinaryStr() {
        StringBuilder sb = new StringBuilder();
        sb.append(macToBinaryStr(destination));
        System.out.println(macToBinaryStr(destination));
        sb.append(macToBinaryStr(source));
        System.out.println(macToBinaryStr(source));
        sb.append(Utils.completeStrWithZero(Integer.toBinaryString(length), 2 * 8, false));
        System.out.println(Utils.completeStrWithZero(Integer.toBinaryString(length), 2 * 8, false));
        sb.append(dataBinary);
        System.out.println(dataBinary);
        System.out.println();
        return sb.toString();
    }

    private String macToBinaryStr(long mac) {
        return Utils.completeStrWithZero(Long.toBinaryString(mac), 6 * 8, false);
    }

    public long getPreamble() {
        return preamble;
    }

    public void setPreamble(long preamble) {
        this.preamble = preamble;
    }

    public long getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(long delimiter) {
        this.delimiter = delimiter;
    }

    public long getDestination() {
        return destination;
    }

    public void setDestination(long destination) {
        this.destination = destination;
    }

    public long getSource() {
        return source;
    }

    public void setSource(long source) {
        this.source = source;
    }

    public int getLength() {
        return length;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        this.length = data.length() + 18;
        dataConvertBinary();
    }

    public int getCrc() {
        return crc;
    }

    public void setCrc(int crc) {
        this.crc = crc;
    }

    private void dataConvertBinary() {
        dataBinary = Utils.strToBinaryStr(data);
        if (data.length() < DATA_MIN_LENGTH) {
            length = DATA_MIN_LENGTH + 18;
            dataBinary = Utils.completeStrWithZero(dataBinary, DATA_MIN_LENGTH * 8, true);
        }
    }
}
