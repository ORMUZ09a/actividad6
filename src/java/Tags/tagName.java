/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author jmmm9_000
 */
public class tagName extends SimpleTagSupport {
    
    @Override
    public void doTag() throws JspException,IOException{
        
    JspWriter out = getJspContext().getOut();
    out.println("Actividad6 realizada por: Jose Martinez");
    }
}
