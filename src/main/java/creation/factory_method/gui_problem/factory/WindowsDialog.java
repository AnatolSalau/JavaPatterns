package creation.factory_method.gui_problem.factory;

import creation.factory_method.gui_problem.button.Button;
import creation.factory_method.gui_problem.button.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}