package de.agilecoders.wicket.extensions.markup.html.bootstrap.form.validation;

import org.apache.wicket.Component;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;

/**
 * <h1>Validation behavior.</h1>
 * <p>Display error messages on form.</p>
 * This behavior may not properly with widgets like bootstrap-select or select2.
 * In this case try to wrap all inputs in div (that's done by default in bootstrap form layout)
 * and set appendToParent of config to true.
 * <br/>
 * <br/>
 * <b>DO NOT USE simple message validation behavior and tooltip validation behavior on one page.</b>
 *
 * @author Alexey Volkov
 * @see FormComponentVisitor
 * @since 15.09.2014
 */
public class SimpleMessageValidation extends ValidationBehavior<SimpleValidationConfig> {

    private static final long serialVersionUID = 1L;

    @Override
    public void renderHead(Component component, IHeaderResponse response) {
        response.render(JavaScriptHeaderItem.forReference(ValidationJS.simple()));
        super.renderHead(component, response);
    }

    @Override
    protected SimpleValidationConfig newConfig() {
        return new SimpleValidationConfig();
    }

}
