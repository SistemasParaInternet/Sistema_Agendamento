package org.apache.jsp.Paciente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listar_005fpacientes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_selectBooleanCheckbox_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_column;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_convertDateTime_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_facet_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_styleClass_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_prependId_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_dataTable_var_value_styleClass_id_cellspacing_cellpadding;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_selectBooleanCheckbox_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_column = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_convertDateTime_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_facet_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_prependId_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_dataTable_var_value_styleClass_id_cellspacing_cellpadding = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_selectBooleanCheckbox_value_nobody.release();
    _jspx_tagPool_h_column.release();
    _jspx_tagPool_f_convertDateTime_pattern_nobody.release();
    _jspx_tagPool_h_outputText_value.release();
    _jspx_tagPool_h_outputText_value_nobody.release();
    _jspx_tagPool_f_facet_name.release();
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.release();
    _jspx_tagPool_h_form_prependId_id.release();
    _jspx_tagPool_h_dataTable_var_value_styleClass_id_cellspacing_cellpadding.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listar Pacientes</title>\n");
      out.write("\n");
      out.write("        <link href=\"../Estilo/bootstrap.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"../Estilo/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id17");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_0.setJspId("id19");
    _jspx_th_h_form_0.setId("listarPac");
    _jspx_th_h_form_0.setPrependId(org.apache.jasper.runtime.PageContextImpl.getValueExpression("false", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_dataTable_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                    <br/><br/>\n");
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_commandButton_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                    <br/><br/>\n");
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_outputText_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                    <br/><br/>\n");
        out.write("\n");
        out.write("                    <a href=\"cadastrar_paciente.jsp\">Voltar</a>\n");
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_prependId_id.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form_prependId_id.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_dataTable_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:dataTable
    com.sun.faces.taglib.html_basic.DataTableTag _jspx_th_h_dataTable_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.DataTableTag.class) : new com.sun.faces.taglib.html_basic.DataTableTag();
    _jspx_th_h_dataTable_0.setPageContext(_jspx_page_context);
    _jspx_th_h_dataTable_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_dataTable_0.setJspId("id21");
    _jspx_th_h_dataTable_0.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("table table-hover table-condensed table-bordered", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_dataTable_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{Paciente.listarPacientes()}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_dataTable_0.setVar("pacientes");
    _jspx_th_h_dataTable_0.setId("listarPacientes");
    _jspx_th_h_dataTable_0.setCellpadding(org.apache.jasper.runtime.PageContextImpl.getValueExpression("2", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_dataTable_0.setCellspacing(org.apache.jasper.runtime.PageContextImpl.getValueExpression("1", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_dataTable_0 = _jspx_th_h_dataTable_0.doStartTag();
    if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_dataTable_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_dataTable_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_column_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_column_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_column_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_column_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_column_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_column_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_column_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_column_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_column_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_dataTable_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_h_dataTable_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_dataTable_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_dataTable_var_value_styleClass_id_cellspacing_cellpadding.reuse(_jspx_th_h_dataTable_0);
      return true;
    }
    _jspx_tagPool_h_dataTable_var_value_styleClass_id_cellspacing_cellpadding.reuse(_jspx_th_h_dataTable_0);
    return false;
  }

  private boolean _jspx_meth_h_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_0.setPageContext(_jspx_page_context);
    _jspx_th_h_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_0.setJspId("id23");
    int _jspx_eval_h_column_0 = _jspx_th_h_column_0.doStartTag();
    if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_f_facet_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_h_selectBooleanCheckbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_column_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_0);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_0);
    return false;
  }

  private boolean _jspx_meth_f_facet_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_0 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_0.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_0);
    _jspx_th_f_facet_0.setName("header");
    int _jspx_eval_f_facet_0 = _jspx_th_f_facet_0.doStartTag();
    if (_jspx_eval_f_facet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <i class=\"icon-star\"></i>\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_f_facet_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_0);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_0);
    _jspx_th_h_outputText_0.setJspId("id29");
    _jspx_th_h_outputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_h_selectBooleanCheckbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:selectBooleanCheckbox
    com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag _jspx_th_h_selectBooleanCheckbox_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag.class) : new com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag();
    _jspx_th_h_selectBooleanCheckbox_0.setPageContext(_jspx_page_context);
    _jspx_th_h_selectBooleanCheckbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_0);
    _jspx_th_h_selectBooleanCheckbox_0.setJspId("id32");
    _jspx_th_h_selectBooleanCheckbox_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pacientes.cb}", (PageContext)_jspx_page_context, java.lang.Boolean.class, null));
    int _jspx_eval_h_selectBooleanCheckbox_0 = _jspx_th_h_selectBooleanCheckbox_0.doStartTag();
    if (_jspx_th_h_selectBooleanCheckbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_selectBooleanCheckbox_value_nobody.reuse(_jspx_th_h_selectBooleanCheckbox_0);
      return true;
    }
    _jspx_tagPool_h_selectBooleanCheckbox_value_nobody.reuse(_jspx_th_h_selectBooleanCheckbox_0);
    return false;
  }

  private boolean _jspx_meth_h_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_1.setPageContext(_jspx_page_context);
    _jspx_th_h_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_1.setJspId("id35");
    int _jspx_eval_h_column_1 = _jspx_th_h_column_1.doStartTag();
    if (_jspx_eval_h_column_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_f_facet_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_h_outputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_column_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_1);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_1);
    return false;
  }

  private boolean _jspx_meth_f_facet_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_1 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_1.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_1);
    _jspx_th_f_facet_1.setName("header");
    int _jspx_eval_f_facet_1 = _jspx_th_f_facet_1.doStartTag();
    if (_jspx_eval_f_facet_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_f_facet_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_1);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_1);
    return false;
  }

  private boolean _jspx_meth_h_outputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_1);
    _jspx_th_h_outputText_1.setJspId("id39");
    _jspx_th_h_outputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("ID", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_1 = _jspx_th_h_outputText_1.doStartTag();
    if (_jspx_th_h_outputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
    return false;
  }

  private boolean _jspx_meth_h_outputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_2.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_1);
    _jspx_th_h_outputText_2.setJspId("id42");
    _jspx_th_h_outputText_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pacientes.idPaciente}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_2 = _jspx_th_h_outputText_2.doStartTag();
    if (_jspx_th_h_outputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
    return false;
  }

  private boolean _jspx_meth_h_column_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_2.setPageContext(_jspx_page_context);
    _jspx_th_h_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_2.setJspId("id45");
    int _jspx_eval_h_column_2 = _jspx_th_h_column_2.doStartTag();
    if (_jspx_eval_h_column_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_f_facet_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_h_outputText_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_column_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_2);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_2);
    return false;
  }

  private boolean _jspx_meth_f_facet_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_2 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_2.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_2);
    _jspx_th_f_facet_2.setName("header");
    int _jspx_eval_f_facet_2 = _jspx_th_f_facet_2.doStartTag();
    if (_jspx_eval_f_facet_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_f_facet_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_2);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_2);
    return false;
  }

  private boolean _jspx_meth_h_outputText_3(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_3.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_2);
    _jspx_th_h_outputText_3.setJspId("id49");
    _jspx_th_h_outputText_3.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Nome", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_3 = _jspx_th_h_outputText_3.doStartTag();
    if (_jspx_th_h_outputText_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_3);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_3);
    return false;
  }

  private boolean _jspx_meth_h_outputText_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_4.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_2);
    _jspx_th_h_outputText_4.setJspId("id52");
    _jspx_th_h_outputText_4.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pacientes.nome}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_4 = _jspx_th_h_outputText_4.doStartTag();
    if (_jspx_th_h_outputText_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_4);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_4);
    return false;
  }

  private boolean _jspx_meth_h_column_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_3.setPageContext(_jspx_page_context);
    _jspx_th_h_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_3.setJspId("id55");
    int _jspx_eval_h_column_3 = _jspx_th_h_column_3.doStartTag();
    if (_jspx_eval_h_column_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_f_facet_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_h_outputText_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_column_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_3);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_3);
    return false;
  }

  private boolean _jspx_meth_f_facet_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_3 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_3.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_3);
    _jspx_th_f_facet_3.setName("header");
    int _jspx_eval_f_facet_3 = _jspx_th_f_facet_3.doStartTag();
    if (_jspx_eval_f_facet_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_f_facet_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_3);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_3);
    return false;
  }

  private boolean _jspx_meth_h_outputText_5(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_5.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_3);
    _jspx_th_h_outputText_5.setJspId("id59");
    _jspx_th_h_outputText_5.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Data de Nascimento", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_5 = _jspx_th_h_outputText_5.doStartTag();
    if (_jspx_th_h_outputText_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_5);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_5);
    return false;
  }

  private boolean _jspx_meth_h_outputText_6(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_6.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_3);
    _jspx_th_h_outputText_6.setJspId("id62");
    _jspx_th_h_outputText_6.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pacientes.dataNasc}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_6 = _jspx_th_h_outputText_6.doStartTag();
    if (_jspx_eval_h_outputText_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_outputText_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_outputText_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_outputText_6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_f_convertDateTime_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_outputText_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_h_outputText_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_outputText_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_outputText_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value.reuse(_jspx_th_h_outputText_6);
      return true;
    }
    _jspx_tagPool_h_outputText_value.reuse(_jspx_th_h_outputText_6);
    return false;
  }

  private boolean _jspx_meth_f_convertDateTime_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_outputText_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:convertDateTime
    com.sun.faces.taglib.jsf_core.ConvertDateTimeTag _jspx_th_f_convertDateTime_0 = (com.sun.faces.taglib.jsf_core.ConvertDateTimeTag) _jspx_tagPool_f_convertDateTime_pattern_nobody.get(com.sun.faces.taglib.jsf_core.ConvertDateTimeTag.class);
    _jspx_th_f_convertDateTime_0.setPageContext(_jspx_page_context);
    _jspx_th_f_convertDateTime_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_outputText_6);
    _jspx_th_f_convertDateTime_0.setPattern(org.apache.jasper.runtime.PageContextImpl.getValueExpression("dd/MM/yyyy", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_f_convertDateTime_0 = _jspx_th_f_convertDateTime_0.doStartTag();
    if (_jspx_th_f_convertDateTime_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_convertDateTime_pattern_nobody.reuse(_jspx_th_f_convertDateTime_0);
      return true;
    }
    _jspx_tagPool_f_convertDateTime_pattern_nobody.reuse(_jspx_th_f_convertDateTime_0);
    return false;
  }

  private boolean _jspx_meth_h_column_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_4.setPageContext(_jspx_page_context);
    _jspx_th_h_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_4.setJspId("id68");
    int _jspx_eval_h_column_4 = _jspx_th_h_column_4.doStartTag();
    if (_jspx_eval_h_column_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_f_facet_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_h_outputText_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_column_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_4);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_4);
    return false;
  }

  private boolean _jspx_meth_f_facet_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_4 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_4.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_4);
    _jspx_th_f_facet_4.setName("header");
    int _jspx_eval_f_facet_4 = _jspx_th_f_facet_4.doStartTag();
    if (_jspx_eval_f_facet_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_f_facet_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_4);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_4);
    return false;
  }

  private boolean _jspx_meth_h_outputText_7(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_7.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_4);
    _jspx_th_h_outputText_7.setJspId("id72");
    _jspx_th_h_outputText_7.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Logradouro", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_7 = _jspx_th_h_outputText_7.doStartTag();
    if (_jspx_th_h_outputText_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_7);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_7);
    return false;
  }

  private boolean _jspx_meth_h_outputText_8(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_8.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_4);
    _jspx_th_h_outputText_8.setJspId("id75");
    _jspx_th_h_outputText_8.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pacientes.logradouro}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_8 = _jspx_th_h_outputText_8.doStartTag();
    if (_jspx_th_h_outputText_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_8);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_8);
    return false;
  }

  private boolean _jspx_meth_h_column_5(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_5.setPageContext(_jspx_page_context);
    _jspx_th_h_column_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_5.setJspId("id78");
    int _jspx_eval_h_column_5 = _jspx_th_h_column_5.doStartTag();
    if (_jspx_eval_h_column_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_f_facet_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_h_outputText_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_column_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_5);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_5);
    return false;
  }

  private boolean _jspx_meth_f_facet_5(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_5 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_5.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_f_facet_5.setName("header");
    int _jspx_eval_f_facet_5 = _jspx_th_f_facet_5.doStartTag();
    if (_jspx_eval_f_facet_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_f_facet_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_5);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_5);
    return false;
  }

  private boolean _jspx_meth_h_outputText_9(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_9.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_5);
    _jspx_th_h_outputText_9.setJspId("id82");
    _jspx_th_h_outputText_9.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Número", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_9 = _jspx_th_h_outputText_9.doStartTag();
    if (_jspx_th_h_outputText_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_9);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_9);
    return false;
  }

  private boolean _jspx_meth_h_outputText_10(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_10.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_5);
    _jspx_th_h_outputText_10.setJspId("id85");
    _jspx_th_h_outputText_10.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pacientes.numero}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_10 = _jspx_th_h_outputText_10.doStartTag();
    if (_jspx_th_h_outputText_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_10);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_10);
    return false;
  }

  private boolean _jspx_meth_h_column_6(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_6.setPageContext(_jspx_page_context);
    _jspx_th_h_column_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_6.setJspId("id88");
    int _jspx_eval_h_column_6 = _jspx_th_h_column_6.doStartTag();
    if (_jspx_eval_h_column_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_6.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_f_facet_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_h_outputText_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_column_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_6);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_6);
    return false;
  }

  private boolean _jspx_meth_f_facet_6(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_6 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_6.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_6);
    _jspx_th_f_facet_6.setName("header");
    int _jspx_eval_f_facet_6 = _jspx_th_f_facet_6.doStartTag();
    if (_jspx_eval_f_facet_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_f_facet_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_6);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_6);
    return false;
  }

  private boolean _jspx_meth_h_outputText_11(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_11.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_6);
    _jspx_th_h_outputText_11.setJspId("id92");
    _jspx_th_h_outputText_11.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Bairro", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_11 = _jspx_th_h_outputText_11.doStartTag();
    if (_jspx_th_h_outputText_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_11);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_11);
    return false;
  }

  private boolean _jspx_meth_h_outputText_12(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_12.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_6);
    _jspx_th_h_outputText_12.setJspId("id95");
    _jspx_th_h_outputText_12.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pacientes.bairro}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_12 = _jspx_th_h_outputText_12.doStartTag();
    if (_jspx_th_h_outputText_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_12);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_12);
    return false;
  }

  private boolean _jspx_meth_h_column_7(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_7.setPageContext(_jspx_page_context);
    _jspx_th_h_column_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_7.setJspId("id98");
    int _jspx_eval_h_column_7 = _jspx_th_h_column_7.doStartTag();
    if (_jspx_eval_h_column_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_f_facet_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_h_outputText_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_column_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_7);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_7);
    return false;
  }

  private boolean _jspx_meth_f_facet_7(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_7 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_7.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_7);
    _jspx_th_f_facet_7.setName("header");
    int _jspx_eval_f_facet_7 = _jspx_th_f_facet_7.doStartTag();
    if (_jspx_eval_f_facet_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_f_facet_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_7);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_7);
    return false;
  }

  private boolean _jspx_meth_h_outputText_13(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_13.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_7);
    _jspx_th_h_outputText_13.setJspId("id102");
    _jspx_th_h_outputText_13.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Cidade", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_13 = _jspx_th_h_outputText_13.doStartTag();
    if (_jspx_th_h_outputText_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_13);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_13);
    return false;
  }

  private boolean _jspx_meth_h_outputText_14(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_14.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_7);
    _jspx_th_h_outputText_14.setJspId("id105");
    _jspx_th_h_outputText_14.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pacientes.cidade}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_14 = _jspx_th_h_outputText_14.doStartTag();
    if (_jspx_th_h_outputText_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_14);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_14);
    return false;
  }

  private boolean _jspx_meth_h_column_8(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.ColumnTag.class) : new com.sun.faces.taglib.html_basic.ColumnTag();
    _jspx_th_h_column_8.setPageContext(_jspx_page_context);
    _jspx_th_h_column_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    _jspx_th_h_column_8.setJspId("id108");
    int _jspx_eval_h_column_8 = _jspx_th_h_column_8.doStartTag();
    if (_jspx_eval_h_column_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_column_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_column_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_column_8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_f_facet_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_h_outputText_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_column_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_column_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_column_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_column_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_column.reuse(_jspx_th_h_column_8);
      return true;
    }
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_8);
    return false;
  }

  private boolean _jspx_meth_f_facet_8(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_8 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_8.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_8);
    _jspx_th_f_facet_8.setName("header");
    int _jspx_eval_f_facet_8 = _jspx_th_f_facet_8.doStartTag();
    if (_jspx_eval_f_facet_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_f_facet_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_8);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_8);
    return false;
  }

  private boolean _jspx_meth_h_outputText_15(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_15.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_8);
    _jspx_th_h_outputText_15.setJspId("id112");
    _jspx_th_h_outputText_15.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("UF", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_15 = _jspx_th_h_outputText_15.doStartTag();
    if (_jspx_th_h_outputText_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_15);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_15);
    return false;
  }

  private boolean _jspx_meth_h_outputText_16(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_16.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_8);
    _jspx_th_h_outputText_16.setJspId("id115");
    _jspx_th_h_outputText_16.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pacientes.uf}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_16 = _jspx_th_h_outputText_16.doStartTag();
    if (_jspx_th_h_outputText_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_16);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_16);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setJspId("id121");
    _jspx_th_h_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Editar", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_0.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("btn", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{Paciente.carregarPaciente()}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_0);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_1.setJspId("id123");
    _jspx_th_h_commandButton_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Apagar", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_1.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("btn", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_1.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{Paciente.remove()}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_1 = _jspx_th_h_commandButton_1.doStartTag();
    if (_jspx_th_h_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_1);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_1);
    return false;
  }

  private boolean _jspx_meth_h_outputText_17(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_17.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_17.setJspId("id127");
    _jspx_th_h_outputText_17.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{Paciente.texto}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_17 = _jspx_th_h_outputText_17.doStartTag();
    if (_jspx_th_h_outputText_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_17);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_17);
    return false;
  }
}
