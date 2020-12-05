package assign1;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.*;

public class LiveBoard {
    private static final String REPOSITORY_URL = "whiteship/live-study";

    public static void main(String[] args) throws IOException {
        GitHub gitHub = GitHub.connectAnonymously();
        GHRepository repository = gitHub.getRepository(REPOSITORY_URL);

        List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);
        Map<String, Integer> map = new HashMap<>();

        for (GHIssue issue : issues) {
            for (String loginId : getLoginIds(issue.getComments())) {
                map.put(loginId, map.getOrDefault(loginId, 0) + 1);
            }
        }
        printResult(map, issues.size());
    }

    public static Set<String> getLoginIds(List<GHIssueComment> comments) throws IOException {
        Set<String> ids = new HashSet();
        for (GHIssueComment comment : comments) {
            ids.add(comment.getUser().getLogin());
        }
        return ids;
    }

    public static void printResult(Map map, int issueSize) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry) iterator.next();
            double percent = (double) entry.getValue() / (double) issueSize * 100;

            System.out.format("%2s : %.2f", entry.getKey(), percent);
            System.out.print(System.lineSeparator());
        }
    }
}
