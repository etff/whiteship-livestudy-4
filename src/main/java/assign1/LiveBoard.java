package assign1;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LiveBoard {

    public static void main(String[] args) throws IOException {
        GitHub gitHub = GitHub.connectAnonymously();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);
        Map<String, Integer> map = new HashMap<>();

        for (int i = 16; i < issues.size(); i++) {
            GHIssue issue = issues.get(i);
            List<GHIssueComment> comments = issue.getComments();
            for (GHIssueComment comment : comments) {
                map.put(comment.getUser().getLogin(), map.getOrDefault(comment.getUser().getLogin(), 0) +1);
            }
        }
        printUser(map);
    }

    public static void printUser(Map map) {
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
