package planet.concurrency_examples.tenth_example;

/**
 * Created by randriyanov on 31.08.15.
 */
public class Task {
    private String content;

    private String answer;

    private int mark;

    public Task(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
