package sample;

public class Data {

    public String text;

    public Data() {
        text = "";
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("'data': {");
        sb.append("'text' = '").append(text).append("'");
        sb.append("}");
        return sb.toString();
    }
}
