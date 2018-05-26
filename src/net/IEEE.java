package net;

import java.util.List;
import java.util.Scanner;

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
public class IEEE {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("input data: ");
        String data1=cin.nextLine();

        List<Frame> frames=Frame.createFrames(data1);
        for (Frame frame : frames) {
            int r=CRC32.calculate(frame);
            System.out.println("crc: ");
            System.out.println(Integer.toBinaryString(r));
            System.out.println(Integer.toHexString(r));
        }
    }
}
