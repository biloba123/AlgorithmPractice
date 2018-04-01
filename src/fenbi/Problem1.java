package fenbi;

import java.io.File;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/15
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */

/**
 *目录/translate下有文件，文件名如 AK~AZ.txt, BA~CZ.txt, DAA~DNA.txt。
 写一个函数，File search(String word), 给定一个单词，找出对应的文件。
 如，参数camera, 返回new File("/translate/BA~CZ.txt")
 */
class Problem1 {
    File search(String word){
        if (word==null || word.length()<1) {
            return null;
        }

        return null;
    }
}
