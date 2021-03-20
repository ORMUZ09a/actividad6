/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tags;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author jmmm9_000
 */
public class tagDate extends SimpleTagSupport{
 
    StringWriter sw = new StringWriter();
    
    @Override
    public void doTag() throws JspException,IOException{
        
    getJspBody().invoke(sw);
    getJspContext().getOut().println("Revision a la hora:"+sw.toString());
    }
}
