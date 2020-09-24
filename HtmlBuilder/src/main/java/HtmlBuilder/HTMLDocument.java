

package HtmlBuilder;

public class HTMLDocument extends ContainerElement {

    public HTMLDocument() {

        name = "html";
    }

    public void setEncoding(String encoding)
    {
        setProperty("encoding", encoding);
    }

    public void setBody(BodyElement body) { super.addElement(body);}


}
