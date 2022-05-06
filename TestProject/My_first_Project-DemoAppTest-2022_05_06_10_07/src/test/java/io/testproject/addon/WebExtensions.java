package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for Web Extensions Addon */
public class WebExtensions {
  /**
   * Factory method for ClickAndHold */
  public static ClickAndHold getClickAndHold() {
    return new ClickAndHold();
  }

  /**
   * Factory method for ContextClick */
  public static ContextClick getContextClick() {
    return new ContextClick();
  }

  /**
   * Factory method for DoubleClick */
  public static DoubleClick getDoubleClick() {
    return new DoubleClick();
  }

  /**
   * Factory method for ExecuteJavascript */
  public static ExecuteJavascript getExecuteJavascript() {
    return new ExecuteJavascript();
  }

  /**
   * Factory method for ExecuteJavascript
   * @param code Script to execute (*)
   * @param args Script arguments */
  public static ExecuteJavascript executeJavascript(String code, String args) {
    return new ExecuteJavascript(code,args);
  }

  /**
   * Factory method for KeyDown */
  public static KeyDown getKeyDown() {
    return new KeyDown();
  }

  /**
   * Factory method for KeyDown
   * @param theKey Unicode PUA (Private Use Area) code point */
  public static KeyDown keyDown(String theKey) {
    return new KeyDown(theKey);
  }

  /**
   * Factory method for KeyUp */
  public static KeyUp getKeyUp() {
    return new KeyUp();
  }

  /**
   * Factory method for KeyUp
   * @param theKey Unicode PUA (Private Use Area) code point */
  public static KeyUp keyUp(String theKey) {
    return new KeyUp(theKey);
  }

  /**
   * Factory method for MoveMouseByOffset */
  public static MoveMouseByOffset getMoveMouseByOffset() {
    return new MoveMouseByOffset();
  }

  /**
   * Factory method for MoveMouseByOffset
   * @param xOffset Pixels to move on X axis
   * @param yOffset Pixels to move on Y axis */
  public static MoveMouseByOffset moveMouseByOffset(int xOffset, int yOffset) {
    return new MoveMouseByOffset(xOffset,yOffset);
  }

  /**
   * Factory method for ReleaseClick */
  public static ReleaseClick getReleaseClick() {
    return new ReleaseClick();
  }

  /**
   * Factory method for AcceptAlert */
  public static AcceptAlert getAcceptAlert() {
    return new AcceptAlert();
  }

  /**
   * Factory method for AcceptAlert
   * @param pause Pause between retries in ms */
  public static AcceptAlert acceptAlert(int pause) {
    return new AcceptAlert(pause);
  }

  /**
   * Factory method for DismissAlert */
  public static DismissAlert getDismissAlert() {
    return new DismissAlert();
  }

  /**
   * Factory method for DismissAlert
   * @param pause Pause between retries in ms */
  public static DismissAlert dismissAlert(int pause) {
    return new DismissAlert(pause);
  }

  /**
   * Factory method for GetAlertText */
  public static GetAlertText getGetAlertText() {
    return new GetAlertText();
  }

  /**
   * Factory method for SendKeysToAlert */
  public static SendKeysToAlert getSendKeysToAlert() {
    return new SendKeysToAlert();
  }

  /**
   * Factory method for SendKeysToAlert
   * @param keys The text to write in the alert box */
  public static SendKeysToAlert sendKeysToAlert(String keys) {
    return new SendKeysToAlert(keys);
  }

  /**
   * Factory method for WaitForAlertPresence */
  public static WaitForAlertPresence getWaitForAlertPresence() {
    return new WaitForAlertPresence();
  }

  /**
   * Factory method for WaitForAlertPresence
   * @param timeout timeout in milliseconds */
  public static WaitForAlertPresence waitForAlertPresence(int timeout) {
    return new WaitForAlertPresence(timeout);
  }

  /**
   * Factory method for AddCookie */
  public static AddCookie getAddCookie() {
    return new AddCookie();
  }

  /**
   * Factory method for AddCookie
   * @param name The name of the cookie (*)
   * @param value The cookie value (*)
   * @param domain The domain the cookie is visible to
   * @param path The path the cookie is visible to. If left blank or set to null, will be set to "/"
   * @param expiry The cookie's expiration date (yyyy-MM-dd HH:mm) (default value is current time)
   * @param secure Set to 'true' if cookie requires a secure connection. (default: false)
   * @param httpOnly Whether this cookie is a httpOnly cookie (true/false) */
  public static AddCookie addCookie(String name, String value, String domain, String path,
      String expiry, boolean secure, boolean httpOnly) {
    return new AddCookie(name,value,domain,path,expiry,secure,httpOnly);
  }

  /**
   * Factory method for DeleteAllCookies */
  public static DeleteAllCookies getDeleteAllCookies() {
    return new DeleteAllCookies();
  }

  /**
   * Factory method for DeleteCookieByName */
  public static DeleteCookieByName getDeleteCookieByName() {
    return new DeleteCookieByName();
  }

  /**
   * Factory method for DeleteCookieByName
   * @param name The name of the cookie to delete */
  public static DeleteCookieByName deleteCookieByName(String name) {
    return new DeleteCookieByName(name);
  }

  /**
   * Factory method for GetCookieByName */
  public static GetCookieByName getGetCookieByName() {
    return new GetCookieByName();
  }

  /**
   * Factory method for GetCookieByName
   * @param name  */
  public static GetCookieByName getCookieByName(String name) {
    return new GetCookieByName(name);
  }

  /**
   * Factory method for SaveAllCookiesToFile */
  public static SaveAllCookiesToFile getSaveAllCookiesToFile() {
    return new SaveAllCookiesToFile();
  }

  /**
   * Factory method for SaveAllCookiesToFile
   * @param folderPath Path to local file, Example: C:\Test\
   * @param fileName Name of the file, defaults to 'Cookies' */
  public static SaveAllCookiesToFile saveAllCookiesToFile(String folderPath, String fileName) {
    return new SaveAllCookiesToFile(folderPath,fileName);
  }

  /**
   * Factory method for ContainsAnyText */
  public static ContainsAnyText getContainsAnyText() {
    return new ContainsAnyText();
  }

  /**
   * Factory method for ContextClickOnElement */
  public static ContextClickOnElement getContextClickOnElement() {
    return new ContextClickOnElement();
  }

  /**
   * Factory method for GetCharactersOnly */
  public static GetCharactersOnly getGetCharactersOnly() {
    return new GetCharactersOnly();
  }

  /**
   * Factory method for GetCssValue */
  public static GetCssValue getGetCssValue() {
    return new GetCssValue();
  }

  /**
   * Factory method for GetCssValue
   * @param propertyName The name of the CSS property */
  public static GetCssValue getCssValue(String propertyName) {
    return new GetCssValue(propertyName);
  }

  /**
   * Factory method for GetElementAttribute */
  public static GetElementAttribute getGetElementAttribute() {
    return new GetElementAttribute();
  }

  /**
   * Factory method for GetElementAttribute
   * @param attributeName The name of the attribute */
  public static GetElementAttribute getElementAttribute(String attributeName) {
    return new GetElementAttribute(attributeName);
  }

  /**
   * Factory method for GetNumbersOnly */
  public static GetNumbersOnly getGetNumbersOnly() {
    return new GetNumbersOnly();
  }

  /**
   * Factory method for IsDisabled */
  public static IsDisabled getIsDisabled() {
    return new IsDisabled();
  }

  /**
   * Factory method for IsEnabled */
  public static IsEnabled getIsEnabled() {
    return new IsEnabled();
  }

  /**
   * Factory method for MoveMouseToElementByOffset */
  public static MoveMouseToElementByOffset getMoveMouseToElementByOffset() {
    return new MoveMouseToElementByOffset();
  }

  /**
   * Factory method for MoveMouseToElementByOffset
   * @param xOffset Offset from the top-left corner. A negative value means coordinates left from the element.
   * @param yOffset Offset from the top-left corner. A negative value means coordinates above the element. */
  public static MoveMouseToElementByOffset moveMouseToElementByOffset(int xOffset, int yOffset) {
    return new MoveMouseToElementByOffset(xOffset,yOffset);
  }

  /**
   * Factory method for CheckIfSelectAllowsMultipleSelection */
  public static CheckIfSelectAllowsMultipleSelection getCheckIfSelectAllowsMultipleSelection() {
    return new CheckIfSelectAllowsMultipleSelection();
  }

  /**
   * Factory method for DeselectAllOptions */
  public static DeselectAllOptions getDeselectAllOptions() {
    return new DeselectAllOptions();
  }

  /**
   * Factory method for DeselectOptionByIndex */
  public static DeselectOptionByIndex getDeselectOptionByIndex() {
    return new DeselectOptionByIndex();
  }

  /**
   * Factory method for DeselectOptionByIndex
   * @param index  */
  public static DeselectOptionByIndex deselectOptionByIndex(int index) {
    return new DeselectOptionByIndex(index);
  }

  /**
   * Factory method for DeselectOptionsByValue */
  public static DeselectOptionsByValue getDeselectOptionsByValue() {
    return new DeselectOptionsByValue();
  }

  /**
   * Factory method for DeselectOptionsByValue
   * @param value The value to match against */
  public static DeselectOptionsByValue deselectOptionsByValue(String value) {
    return new DeselectOptionsByValue(value);
  }

  /**
   * Factory method for SelectOptionByIndex */
  public static SelectOptionByIndex getSelectOptionByIndex() {
    return new SelectOptionByIndex();
  }

  /**
   * Factory method for SelectOptionByIndex
   * @param index The option at this index will be selected */
  public static SelectOptionByIndex selectOptionByIndex(int index) {
    return new SelectOptionByIndex(index);
  }

  /**
   * Factory method for SelectOptionByValue */
  public static SelectOptionByValue getSelectOptionByValue() {
    return new SelectOptionByValue();
  }

  /**
   * Factory method for SelectOptionByValue
   * @param value The value to match against */
  public static SelectOptionByValue selectOptionByValue(String value) {
    return new SelectOptionByValue(value);
  }

  /**
   * Factory method for SelectOptionbyVisibleText */
  public static SelectOptionbyVisibleText getSelectOptionbyVisibleText() {
    return new SelectOptionbyVisibleText();
  }

  /**
   * Factory method for SelectOptionbyVisibleText
   * @param value The text of the option to select */
  public static SelectOptionbyVisibleText selectOptionbyVisibleText(String value) {
    return new SelectOptionbyVisibleText(value);
  }

  /**
   * Factory method for SetElementAttribute */
  public static SetElementAttribute getSetElementAttribute() {
    return new SetElementAttribute();
  }

  /**
   * Factory method for SetElementAttribute
   * @param attributeName The name of the attribute
   * @param attributeValue The new value of the attribute */
  public static SetElementAttribute setElementAttribute(String attributeName,
      String attributeValue) {
    return new SetElementAttribute(attributeName,attributeValue);
  }

  /**
   * Factory method for ClearLocalStorage */
  public static ClearLocalStorage getClearLocalStorage() {
    return new ClearLocalStorage();
  }

  /**
   * Factory method for GetItemFromLocalStorage */
  public static GetItemFromLocalStorage getGetItemFromLocalStorage() {
    return new GetItemFromLocalStorage();
  }

  /**
   * Factory method for GetItemFromLocalStorage
   * @param key  */
  public static GetItemFromLocalStorage getItemFromLocalStorage(String key) {
    return new GetItemFromLocalStorage(key);
  }

  /**
   * Factory method for RemoveItemFromLocalStorage */
  public static RemoveItemFromLocalStorage getRemoveItemFromLocalStorage() {
    return new RemoveItemFromLocalStorage();
  }

  /**
   * Factory method for RemoveItemFromLocalStorage
   * @param key  */
  public static RemoveItemFromLocalStorage removeItemFromLocalStorage(String key) {
    return new RemoveItemFromLocalStorage(key);
  }

  /**
   * Factory method for SetItemInLocalStorage */
  public static SetItemInLocalStorage getSetItemInLocalStorage() {
    return new SetItemInLocalStorage();
  }

  /**
   * Factory method for SetItemInLocalStorage
   * @param key 
   * @param value  */
  public static SetItemInLocalStorage setItemInLocalStorage(String key, String value) {
    return new SetItemInLocalStorage(key,value);
  }

  /**
   * Factory method for GetCurrentWindowHandle */
  public static GetCurrentWindowHandle getGetCurrentWindowHandle() {
    return new GetCurrentWindowHandle();
  }

  /**
   * Factory method for GetWindowsList */
  public static GetWindowsList getGetWindowsList() {
    return new GetWindowsList();
  }

  /**
   * Factory method for MaximizeWindow */
  public static MaximizeWindow getMaximizeWindow() {
    return new MaximizeWindow();
  }

  /**
   * Factory method for SetWindowPosition */
  public static SetWindowPosition getSetWindowPosition() {
    return new SetWindowPosition();
  }

  /**
   * Factory method for SetWindowPosition
   * @param x 
   * @param y  */
  public static SetWindowPosition setWindowPosition(String x, String y) {
    return new SetWindowPosition(x,y);
  }

  /**
   * Factory method for SetWindowSize */
  public static SetWindowSize getSetWindowSize() {
    return new SetWindowSize();
  }

  /**
   * Factory method for SetWindowSize
   * @param width 
   * @param height  */
  public static SetWindowSize setWindowSize(String width, String height) {
    return new SetWindowSize(width,height);
  }

  /**
   * Click and hold. Clicks and holds the mouse button at the last known mouse coordinates */
  public static class ClickAndHold extends ActionProxy {
    public ClickAndHold() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.actions.ClickAndHold"));
    }
  }

  /**
   * Context click. Right-clicks the mouse at the last known mouse coordinates */
  public static class ContextClick extends ActionProxy {
    public ContextClick() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.actions.ContextClick"));
    }
  }

  /**
   * Double click. Double-clicks the mouse at the last known mouse coordinates */
  public static class DoubleClick extends ActionProxy {
    public DoubleClick() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.actions.DoubleClick"));
    }
  }

  /**
   * Execute JavaScript. Executes a JavaScript code */
  public static class ExecuteJavascript extends ActionProxy {
    /**
     * Script to execute (*) (INPUT) */
    public String code;

    /**
     * Script arguments (INPUT) */
    public String args;

    /**
     * Script output, or empty string if null (OUTPUT) */
    public String output;

    public ExecuteJavascript() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.actions.ExecuteJavascript"));
    }

    public ExecuteJavascript(String code, String args) {
      this();
      this.code = code;
      this.args = args;
    }
  }

  /**
   * Press and hold key. Performs a modifier key press (kept pressed) */
  public static class KeyDown extends ActionProxy {
    /**
     * Unicode PUA (Private Use Area) code point (INPUT) */
    public String theKey;

    public KeyDown() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.actions.KeyDown"));
    }

    public KeyDown(String theKey) {
      this();
      this.theKey = theKey;
    }
  }

  /**
   * Release pressed key. Releases the key (shift, ctrl, etc) that was pressed */
  public static class KeyUp extends ActionProxy {
    /**
     * Unicode PUA (Private Use Area) code point (INPUT) */
    public String theKey;

    public KeyUp() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.actions.KeyUp"));
    }

    public KeyUp(String theKey) {
      this();
      this.theKey = theKey;
    }
  }

  /**
   * Move mouse by offset. Moves the mouse from current position by the given offset */
  public static class MoveMouseByOffset extends ActionProxy {
    /**
     * Pixels to move on X axis (INPUT) */
    public int xOffset;

    /**
     * Pixels to move on Y axis (INPUT) */
    public int yOffset;

    public MoveMouseByOffset() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.actions.MoveMouseByOffset"));
    }

    public MoveMouseByOffset(int xOffset, int yOffset) {
      this();
      this.xOffset = xOffset;
      this.yOffset = yOffset;
    }
  }

  /**
   * Release left mouse button. Releases the mouse button at the last known mouse coordinates */
  public static class ReleaseClick extends ActionProxy {
    public ReleaseClick() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.actions.ReleaseClick"));
    }
  }

  /**
   * Accept alert. Accepts an alert by clicking on the 'OK' button of the alert */
  public static class AcceptAlert extends ActionProxy {
    /**
     * Pause between retries in ms (INPUT) */
    public int pause;

    public AcceptAlert() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.alert.AcceptAlert"));
    }

    public AcceptAlert(int pause) {
      this();
      this.pause = pause;
    }
  }

  /**
   * Dismiss alert. Dismisses an alert by clicking on the 'Cancel' button of the alert */
  public static class DismissAlert extends ActionProxy {
    /**
     * Pause between retries in ms (INPUT) */
    public int pause;

    public DismissAlert() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.alert.DismissAlert"));
    }

    public DismissAlert(int pause) {
      this();
      this.pause = pause;
    }
  }

  /**
   * Get alert text. Return to text parameter the text in the alert */
  public static class GetAlertText extends ActionProxy {
    /**
     * The text that the alert show (OUTPUT) */
    public String text;

    public GetAlertText() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.alert.GetAlertText"));
    }
  }

  /**
   * Send keys to alert. Sends keys (text) to an alert */
  public static class SendKeysToAlert extends ActionProxy {
    /**
     * The text to write in the alert box (INPUT) */
    public String keys;

    public SendKeysToAlert() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.alert.SendKeysToAlert"));
    }

    public SendKeysToAlert(String keys) {
      this();
      this.keys = keys;
    }
  }

  /**
   * Wait for alert presence. Wait until the alert is displayed (default timeout is 0) */
  public static class WaitForAlertPresence extends ActionProxy {
    /**
     * timeout in milliseconds (INPUT) */
    public int timeout;

    public WaitForAlertPresence() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.alert.WaitForAlertPresence"));
    }

    public WaitForAlertPresence(int timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Add Cookie. Adds a Cookie */
  public static class AddCookie extends ActionProxy {
    /**
     * The name of the cookie (*) (INPUT) */
    public String name;

    /**
     * The cookie value (*) (INPUT) */
    public String value;

    /**
     * The domain the cookie is visible to (INPUT) */
    public String domain;

    /**
     * The path the cookie is visible to. If left blank or set to null, will be set to "/" (INPUT) */
    public String path;

    /**
     * The cookie's expiration date (yyyy-MM-dd HH:mm) (default value is current time) (INPUT) */
    public String expiry;

    /**
     * Set to 'true' if cookie requires a secure connection. (default: false) (INPUT) */
    public boolean secure;

    /**
     * Whether this cookie is a httpOnly cookie (true/false) (INPUT) */
    public boolean httpOnly;

    public AddCookie() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.cookies.AddCookie"));
    }

    public AddCookie(String name, String value, String domain, String path, String expiry,
        boolean secure, boolean httpOnly) {
      this();
      this.name = name;
      this.value = value;
      this.domain = domain;
      this.path = path;
      this.expiry = expiry;
      this.secure = secure;
      this.httpOnly = httpOnly;
    }
  }

  /**
   * Delete all cookies. Delete all the cookies for the current domain */
  public static class DeleteAllCookies extends ActionProxy {
    public DeleteAllCookies() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.cookies.DeleteAllCookies"));
    }
  }

  /**
   * Delete a cookie. Delete the named cookie from the current domain */
  public static class DeleteCookieByName extends ActionProxy {
    /**
     * The name of the cookie to delete (INPUT) */
    public String name;

    public DeleteCookieByName() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.cookies.DeleteCookieByName"));
    }

    public DeleteCookieByName(String name) {
      this();
      this.name = name;
    }
  }

  /**
   * Get cookie. Return specific cookie according to name */
  public static class GetCookieByName extends ActionProxy {
    /**
     *  (INPUT) */
    public String name;

    /**
     * The cookie's value (OUTPUT) */
    public String value;

    /**
     * The cookie's expiration date (EEE MMM dd HH:mm:ss zzz yyyy) (OUTPUT) */
    public String expiry;

    /**
     * The path the cookie is visible to (OUTPUT) */
    public String path;

    /**
     * The domain the cookie is visible to (OUTPUT) */
    public String domain;

    /**
     * Whether this cookie requires a secure connection (true/false) (OUTPUT) */
    public boolean isSecure;

    public GetCookieByName() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.cookies.GetCookieByName"));
    }

    public GetCookieByName(String name) {
      this();
      this.name = name;
    }
  }

  /**
   * Save All Cookies to file.  */
  public static class SaveAllCookiesToFile extends ActionProxy {
    /**
     * Path to local file, Example: C:\Test\ (INPUT) */
    public String folderPath;

    /**
     * Name of the file, defaults to 'Cookies' (INPUT) */
    public String fileName;

    public SaveAllCookiesToFile() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.cookies.SaveAllCookiesToFile"));
    }

    public SaveAllCookiesToFile(String folderPath, String fileName) {
      this();
      this.folderPath = folderPath;
      this.fileName = fileName;
    }
  }

  /**
   * Contains any text?. null */
  public static class ContainsAnyText extends ActionProxy {
    /**
     * Returns true if there is any text and false otherwise (OUTPUT) */
    public String IsTextAvailable;

    public ContainsAnyText() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.ContainsAnyText"));
    }
  }

  /**
   * Context Click. Performs a context click at the current mouse position */
  public static class ContextClickOnElement extends ActionProxy {
    public ContextClickOnElement() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.ContextClickOnElement"));
    }
  }

  /**
   * Get Characters Only.  */
  public static class GetCharactersOnly extends ActionProxy {
    /**
     * Characters only (OUTPUT) */
    public String output;

    public GetCharactersOnly() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.GetCharactersOnly"));
    }
  }

  /**
   * Get CSS value. Gets CSS value from an element */
  public static class GetCssValue extends ActionProxy {
    /**
     * The name of the CSS property (INPUT) */
    public String propertyName;

    /**
     * The value of the property (OUTPUT) */
    public String value;

    public GetCssValue() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.GetCssValue"));
    }

    public GetCssValue(String propertyName) {
      this();
      this.propertyName = propertyName;
    }
  }

  /**
   * Get attribute value. Retrieves the value of an attribute of an element */
  public static class GetElementAttribute extends ActionProxy {
    /**
     * The name of the attribute (INPUT) */
    public String attributeName;

    /**
     * The value of the desired attribute (OUTPUT) */
    public String attributeValue;

    public GetElementAttribute() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.GetElementAttribute"));
    }

    public GetElementAttribute(String attributeName) {
      this();
      this.attributeName = attributeName;
    }
  }

  /**
   * Get Numbers Only.  */
  public static class GetNumbersOnly extends ActionProxy {
    /**
     * Numeric values only (OUTPUT) */
    public String output;

    public GetNumbersOnly() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.GetNumbersOnly"));
    }
  }

  /**
   * Is Disabled?.  */
  public static class IsDisabled extends ActionProxy {
    public IsDisabled() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.IsDisabled"));
    }
  }

  /**
   * Is Enabled?.  */
  public static class IsEnabled extends ActionProxy {
    public IsEnabled() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.IsEnabled"));
    }
  }

  /**
   * Move mouse to element with offset. Moves the mouse to an offset from the top-left corner of the element, element is scrolled into view */
  public static class MoveMouseToElementByOffset extends ActionProxy {
    /**
     * Offset from the top-left corner. A negative value means coordinates left from the element. (INPUT) */
    public int xOffset;

    /**
     * Offset from the top-left corner. A negative value means coordinates above the element. (INPUT) */
    public int yOffset;

    public MoveMouseToElementByOffset() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.MoveMouseToElementByOffset"));
    }

    public MoveMouseToElementByOffset(int xOffset, int yOffset) {
      this();
      this.xOffset = xOffset;
      this.yOffset = yOffset;
    }
  }

  /**
   * Select allows multiple selection?. Checks whether this select element support selecting multiple options at the same time */
  public static class CheckIfSelectAllowsMultipleSelection extends ActionProxy {
    /**
     *  (OUTPUT) */
    public boolean multiple;

    public CheckIfSelectAllowsMultipleSelection() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.select.CheckIfSelectAllowsMultipleSelection"));
    }
  }

  /**
   * Deselect all options. Clear all selected entries */
  public static class DeselectAllOptions extends ActionProxy {
    public DeselectAllOptions() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.select.DeselectAllOptions"));
    }
  }

  /**
   * Deselect an option by index. Deselect an option by it's given index (starts from 0) */
  public static class DeselectOptionByIndex extends ActionProxy {
    /**
     *  (INPUT) */
    public int index;

    public DeselectOptionByIndex() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.select.DeselectOptionByIndex"));
    }

    public DeselectOptionByIndex(int index) {
      this();
      this.index = index;
    }
  }

  /**
   * Deselect all options by value attribute. Deselect all option with specified value attribute */
  public static class DeselectOptionsByValue extends ActionProxy {
    /**
     * The value to match against (INPUT) */
    public String value;

    public DeselectOptionsByValue() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.select.DeselectOptionsByValue"));
    }

    public DeselectOptionsByValue(String value) {
      this();
      this.value = value;
    }
  }

  /**
   * Select an option by index. Deselect an option by it's given index (start from 0) */
  public static class SelectOptionByIndex extends ActionProxy {
    /**
     * The option at this index will be selected (INPUT) */
    public int index;

    public SelectOptionByIndex() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.select.SelectOptionByIndex"));
    }

    public SelectOptionByIndex(int index) {
      this();
      this.index = index;
    }
  }

  /**
   * Select all options by value attribute. Select all options with selected value attribute */
  public static class SelectOptionByValue extends ActionProxy {
    /**
     * The value to match against (INPUT) */
    public String value;

    public SelectOptionByValue() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.select.SelectOptionByValue"));
    }

    public SelectOptionByValue(String value) {
      this();
      this.value = value;
    }
  }

  /**
   * Select options by text. Select any option with text that have a value matching the value parameter */
  public static class SelectOptionbyVisibleText extends ActionProxy {
    /**
     * The text of the option to select (INPUT) */
    public String value;

    public SelectOptionbyVisibleText() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.select.SelectOptionbyVisibleText"));
    }

    public SelectOptionbyVisibleText(String value) {
      this();
      this.value = value;
    }
  }

  /**
   * Set attribute value. Sets the value of an attribute of an element */
  public static class SetElementAttribute extends ActionProxy {
    /**
     * The name of the attribute (INPUT) */
    public String attributeName;

    /**
     * The new value of the attribute (INPUT) */
    public String attributeValue;

    public SetElementAttribute() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.element.SetElementAttribute"));
    }

    public SetElementAttribute(String attributeName, String attributeValue) {
      this();
      this.attributeName = attributeName;
      this.attributeValue = attributeValue;
    }
  }

  /**
   * Clear local storage. Clears local storage */
  public static class ClearLocalStorage extends ActionProxy {
    public ClearLocalStorage() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.localstorage.ClearLocalStorage"));
    }
  }

  /**
   * Get item from local storage. Retrieves an item from local storage */
  public static class GetItemFromLocalStorage extends ActionProxy {
    /**
     *  (INPUT) */
    public String key;

    /**
     *  (OUTPUT) */
    public String value;

    public GetItemFromLocalStorage() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.localstorage.GetItemFromLocalStorage"));
    }

    public GetItemFromLocalStorage(String key) {
      this();
      this.key = key;
    }
  }

  /**
   * Remove item from local storage. Removes an item from local storage */
  public static class RemoveItemFromLocalStorage extends ActionProxy {
    /**
     *  (INPUT) */
    public String key;

    public RemoveItemFromLocalStorage() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.localstorage.RemoveItemFromLocalStorage"));
    }

    public RemoveItemFromLocalStorage(String key) {
      this();
      this.key = key;
    }
  }

  /**
   * Set value for item in local storage. Sets value for item in local storage */
  public static class SetItemInLocalStorage extends ActionProxy {
    /**
     *  (INPUT) */
    public String key;

    /**
     *  (INPUT) */
    public String value;

    public SetItemInLocalStorage() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.localstorage.SetItemInLocalStorage"));
    }

    public SetItemInLocalStorage(String key, String value) {
      this();
      this.key = key;
      this.value = value;
    }
  }

  /**
   * Get current window handle. Return an opaque handle to this window that uniquely identifies it within this driver instance */
  public static class GetCurrentWindowHandle extends ActionProxy {
    /**
     *  (OUTPUT) */
    public String nameOrHandle;

    public GetCurrentWindowHandle() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.window.GetCurrentWindowHandle"));
    }
  }

  /**
   * Get windows handles. Return a set of window handles */
  public static class GetWindowsList extends ActionProxy {
    /**
     *  (OUTPUT) */
    public String windowHandles;

    public GetWindowsList() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.window.GetWindowsList"));
    }
  }

  /**
   * Maximize window. Maximizes the current window */
  public static class MaximizeWindow extends ActionProxy {
    public MaximizeWindow() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.window.MaximizeWindow"));
    }
  }

  /**
   * Set window position. Set the position of the current window relative to the upper left corner of the screen */
  public static class SetWindowPosition extends ActionProxy {
    /**
     *  (INPUT) */
    public String x;

    /**
     *  (INPUT) */
    public String y;

    public SetWindowPosition() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.window.SetWindowPosition"));
    }

    public SetWindowPosition(String x, String y) {
      this();
      this.x = x;
      this.y = y;
    }
  }

  /**
   * Set window size. Set the size of the current window */
  public static class SetWindowSize extends ActionProxy {
    /**
     *  (INPUT) */
    public String width;

    /**
     *  (INPUT) */
    public String height;

    public SetWindowSize() {
      this.setDescriptor(new ProxyDescriptor("Xey4bVsJQEODIUN7ssaJMg", "io.testproject.addons.web.window.SetWindowSize"));
    }

    public SetWindowSize(String width, String height) {
      this();
      this.width = width;
      this.height = height;
    }
  }
}
