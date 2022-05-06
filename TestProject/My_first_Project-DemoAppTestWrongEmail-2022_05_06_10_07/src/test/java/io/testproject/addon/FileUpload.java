package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for File Upload Addon */
public class FileUpload {
  /**
   * Factory method for UploadFileElementAction */
  public static UploadFileElementAction getUploadFileElementAction() {
    return new UploadFileElementAction();
  }

  /**
   * Factory method for UploadFileElementAction
   * @param PATH The local path to the file */
  public static UploadFileElementAction uploadFileElementAction(String PATH) {
    return new UploadFileElementAction(PATH);
  }

  /**
   * Upload file.  */
  public static class UploadFileElementAction extends ActionProxy {
    /**
     * The local path to the file (INPUT) */
    public String PATH;

    public UploadFileElementAction() {
      this.setDescriptor(new ProxyDescriptor("kdm6mjOcjEGSxdIP19l55g", "UploadFileElementAction"));
    }

    public UploadFileElementAction(String PATH) {
      this();
      this.PATH = PATH;
    }
  }
}
