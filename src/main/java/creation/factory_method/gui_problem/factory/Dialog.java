package creation.factory_method.gui_problem.factory;

import creation.factory_method.gui_problem.button.Button;

/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
public abstract class Dialog {

      public void renderWindow() {
            // ... остальной код диалога ...

            Button okButton = createButton();
            okButton.render();
      }

      /**
       * Подклассы будут переопределять этот метод, чтобы создавать конкретные
       * объекты продуктов, разные для каждой фабрики.
       */
      public abstract Button createButton();
}
