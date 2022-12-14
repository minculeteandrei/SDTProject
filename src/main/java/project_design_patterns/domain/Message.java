package project_design_patterns.domain;

public class Message {
    protected String data;
    protected String warning;
    protected String error;

    public Message(){}
    public Message(MessageBuilder builder) {
        this.data = builder.data;
        this.warning = builder.warning;
        this.error = builder.error;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static class MessageBuilder extends Message{

        public MessageBuilder(String data) {
            super();
            this.data = data;
        }

        public MessageBuilder warning(String warning){
            this.warning = warning;
            return this;
        }

        public MessageBuilder error(String error){
            this.error = error;
            return this;
        }

        public Message build() {return new Message(this);}
    }

    @Override
    public String toString() {
        return "Message{" +
                "data='" + data + '\'' +
                ", warning='" + warning + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
