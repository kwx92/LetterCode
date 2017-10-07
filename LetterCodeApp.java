/*
 * Author: Katelyn Waddell 
 */

package lettercode;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;


public class LetterCodeApp extends SingleFrameApplication {


    @Override protected void startup() {
        show(new LetterCodeView(this));
    }


    @Override protected void configureWindow(java.awt.Window root) {
    }


    public static LetterCodeApp getApplication() {
        return Application.getInstance(LetterCodeApp.class);
    }


    public static void main(String[] args) {
        launch(LetterCodeApp.class, args);
    }
}
