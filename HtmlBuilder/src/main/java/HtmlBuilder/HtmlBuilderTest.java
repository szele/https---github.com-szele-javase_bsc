

package HtmlBuilder;


public class HtmlBuilderTest {
    public static void main(String[] args) {


        BodyElement body = new BodyElement();
        body.addElement("Hello HTMLBuilder Testelements Text Test 0!" );

        DIVElement div1 = new DIVElement();
        div1.setId("1");
        div1.addElement("Hello HTMLBuilder Testelements Text Test 1!" );
        body.addElement(div1);

        DIVElement div2;
        div2 = new DIVElement();
        div2.setId("2");
        div2.addElement("Hello HTMLBuilder Testelements Text Test 2!" );
        body.addElement(div2);


        HTMLDocument  document= new HTMLDocument();
        document.setBody(body);

        System.out.println(document.toHtml());

    }

}
