public class Task4 {
    public static void main(String[] args) {
        String[] strs = {"aabb", "aabbb", "aaabb"};
        System.out.print(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (var str : strs)
            // Возвращает целочисленное значение, указывающее начальную
            // позицию строки в объекте String.
            // Если строка не найдена, возвращается -1.
            while (str.indexOf(prefix) != 0) {
                // Начальная позиция подстроки не равна 0,
                // затем подстрока сокращается, а затем сравнивается.
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }
}
