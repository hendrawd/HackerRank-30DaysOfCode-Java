import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-regex-patterns">https://www.hackerrank.com/challenges/30-regex-patterns</a>
 * @since 5/31/16
 */

public class Day28_RegExPatternsAndIntroToDatabases {
    private BufferedReader br;
    private PrintWriter out;

    public static void main(String[] args) throws IOException {
        new Day28_RegExPatternsAndIntroToDatabases();
    }

    private void solve() throws IOException {
        int t = Integer.parseInt(br.readLine());
        List<String> nameList = new ArrayList<>();
        while (t-- > 0) {
            String line = br.readLine();
            if (line.endsWith("@gmail.com")) {
                nameList.add(line.split(" ")[0]);
            }
        }
        Collections.sort(nameList);
        for (String name : nameList) {
            out.println(name);
        }
    }

    public Day28_RegExPatternsAndIntroToDatabases() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
}
