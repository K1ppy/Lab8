package Main;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static  void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String PATTERN = "^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[9]?\\d{2}|[2][0][0-1][0-9]|[2][0][2][0]))$|^(?:29(\\/)0?2\\3(?:(?:(?:1[9]|[2][0])?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[9]?\\d{2}|[2][0][0-1][0-9]|[2][0][2][0]))$";
            Pattern pattern = Pattern.compile(PATTERN);
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            while(matcher.find())
            {
                int start = matcher.start();
                int end = matcher.end();
                System.out.println("Найдено совпадение " + input.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
