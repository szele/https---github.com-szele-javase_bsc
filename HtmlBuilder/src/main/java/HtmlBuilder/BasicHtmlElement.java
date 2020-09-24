
package HtmlBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicHtmlElement implements HTMLElement{

    protected String name;

    private final Map<String,String> properties = new HashMap<>();

    protected String getContent() { return null;}

    protected void setProperty(String name, String value)
    {
        properties.put(name, value);
    }

    protected void getProperty(String name, String value)
    {
        properties.put(name, value);
    }


    @Override
    public String toHtml() {
        StringBuilder htmlValue = new StringBuilder();

        htmlValue = new StringBuilder("<" + name + " ");
        for (Map.Entry<String,String> entry : properties.entrySet())
        {

            htmlValue.append(entry.getKey()).append("=\"").append(entry.getValue()).append("\" ");
        }


        if (getContent() == null) { htmlValue.append("/>"); }
        else
        {
            htmlValue.append(">").append(getContent()).append("</").append(name).append(">\n");
        }
        return htmlValue.toString();
    }



}
