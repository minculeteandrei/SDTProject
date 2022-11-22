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

    static class MessageBuilder extends Message{

        public MessageBuilder(String data, String warning, String error) {
            super();
            this.data = data;
            this.warning = warning;
            this.error = error;
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
