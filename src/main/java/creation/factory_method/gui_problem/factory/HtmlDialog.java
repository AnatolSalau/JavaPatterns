package creation.factory_method.gui_problem.factory;

import creation.factory_method.gui_problem.button.Button;
import creation.factory_method.gui_problem.button.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

      @Override
      public Button createButton() {
            return new HtmlButton();
      }
}