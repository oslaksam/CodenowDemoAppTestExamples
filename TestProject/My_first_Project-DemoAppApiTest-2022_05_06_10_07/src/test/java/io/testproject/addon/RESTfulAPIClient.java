package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for RESTful API Client Addon */
public class RESTfulAPIClient {
  /**
   * Factory method for PutAction */
  public static PutAction getPutAction() {
    return new PutAction();
  }

  /**
   * Factory method for PutAction
   * @param body Request body
   * @param format Body format
   * @param filePath Local file path, if a file upload is required (e.g. C:\Test\test_file.txt)
   * @param uri Endpoint URL
   * @param query Query parameters (e.g. abc=123&efg=456)
   * @param headers Request headers (default: h1=v1,h2=v2
   * @param expectedStatus Expected response code
   * @param jsonPath Jayway JsonPath (e.g. '$.key', see docs for more info)
   * @param ignoreUntrustedCertificate Ignore untrusted SSL certificate (true/false)
   * @param schemaPath The path to the Json Schema
   * @param createFile Create a file for the Schema validation result? (true/false)
   * @param schemaValidationOutputFilePath If createFile is true, this will be the output path for the validation result file
   * @param headerDelimiter Which character to delimit the headers? (e.g '=' by default) */
  public static PutAction putAction(String body, String format, String filePath, String uri,
      String query, String headers, String expectedStatus, String jsonPath,
      boolean ignoreUntrustedCertificate, String schemaPath, boolean createFile,
      String schemaValidationOutputFilePath, String headerDelimiter) {
    return new PutAction(body,format,filePath,uri,query,headers,expectedStatus,jsonPath,ignoreUntrustedCertificate,schemaPath,createFile,schemaValidationOutputFilePath,headerDelimiter);
  }

  /**
   * Factory method for PatchAction */
  public static PatchAction getPatchAction() {
    return new PatchAction();
  }

  /**
   * Factory method for PatchAction
   * @param body Request body
   * @param format Body format
   * @param filePath Local file path, if a file upload is required (e.g. C:\Test\test_file.txt)
   * @param uri Endpoint URL
   * @param query Query parameters (e.g. abc=123&efg=456)
   * @param headers Request headers (default: h1=v1,h2=v2
   * @param expectedStatus Expected response code
   * @param jsonPath Jayway JsonPath (e.g. '$.key', see docs for more info)
   * @param ignoreUntrustedCertificate Ignore untrusted SSL certificate (true/false)
   * @param schemaPath The path to the Json Schema
   * @param createFile Create a file for the Schema validation result? (true/false)
   * @param schemaValidationOutputFilePath If createFile is true, this will be the output path for the validation result file
   * @param headerDelimiter Which character to delimit the headers? (e.g '=' by default) */
  public static PatchAction patchAction(String body, String format, String filePath, String uri,
      String query, String headers, String expectedStatus, String jsonPath,
      boolean ignoreUntrustedCertificate, String schemaPath, boolean createFile,
      String schemaValidationOutputFilePath, String headerDelimiter) {
    return new PatchAction(body,format,filePath,uri,query,headers,expectedStatus,jsonPath,ignoreUntrustedCertificate,schemaPath,createFile,schemaValidationOutputFilePath,headerDelimiter);
  }

  /**
   * Factory method for GetAction */
  public static GetAction getGetAction() {
    return new GetAction();
  }

  /**
   * Factory method for GetAction
   * @param body Request body
   * @param format Body format
   * @param uri Endpoint URL
   * @param query Query parameters (e.g. abc=123&efg=456)
   * @param headers Request headers (default: h1=v1,h2=v2
   * @param expectedStatus Expected response code
   * @param jsonPath Jayway JsonPath (e.g. '$.key', see docs for more info)
   * @param ignoreUntrustedCertificate Ignore untrusted SSL certificate (true/false)
   * @param schemaPath The path to the Json Schema
   * @param createFile Create a file for the Schema validation result? (true/false)
   * @param schemaValidationOutputFilePath If createFile is true, this will be the output path for the validation result file
   * @param headerDelimiter Which character to delimit the headers? (e.g '=' by default) */
  public static GetAction getAction(String body, String format, String uri, String query,
      String headers, String expectedStatus, String jsonPath, boolean ignoreUntrustedCertificate,
      String schemaPath, boolean createFile, String schemaValidationOutputFilePath,
      String headerDelimiter) {
    return new GetAction(body,format,uri,query,headers,expectedStatus,jsonPath,ignoreUntrustedCertificate,schemaPath,createFile,schemaValidationOutputFilePath,headerDelimiter);
  }

  /**
   * Factory method for DeleteAction */
  public static DeleteAction getDeleteAction() {
    return new DeleteAction();
  }

  /**
   * Factory method for DeleteAction
   * @param body Request body
   * @param format Body format
   * @param uri Endpoint URL
   * @param query Query parameters (e.g. abc=123&efg=456)
   * @param headers Request headers (default: h1=v1,h2=v2
   * @param expectedStatus Expected response code
   * @param jsonPath Jayway JsonPath (e.g. '$.key', see docs for more info)
   * @param ignoreUntrustedCertificate Ignore untrusted SSL certificate (true/false)
   * @param schemaPath The path to the Json Schema
   * @param createFile Create a file for the Schema validation result? (true/false)
   * @param schemaValidationOutputFilePath If createFile is true, this will be the output path for the validation result file
   * @param headerDelimiter Which character to delimit the headers? (e.g '=' by default) */
  public static DeleteAction deleteAction(String body, String format, String uri, String query,
      String headers, String expectedStatus, String jsonPath, boolean ignoreUntrustedCertificate,
      String schemaPath, boolean createFile, String schemaValidationOutputFilePath,
      String headerDelimiter) {
    return new DeleteAction(body,format,uri,query,headers,expectedStatus,jsonPath,ignoreUntrustedCertificate,schemaPath,createFile,schemaValidationOutputFilePath,headerDelimiter);
  }

  /**
   * Factory method for PostAction */
  public static PostAction getPostAction() {
    return new PostAction();
  }

  /**
   * Factory method for PostAction
   * @param body Request body
   * @param format Body format
   * @param filePath Local file path, if a file upload is required (e.g. C:\Test\test_file.txt)
   * @param uri Endpoint URL
   * @param query Query parameters (e.g. abc=123&efg=456)
   * @param headers Request headers (default: h1=v1,h2=v2
   * @param expectedStatus Expected response code
   * @param jsonPath Jayway JsonPath (e.g. '$.key', see docs for more info)
   * @param ignoreUntrustedCertificate Ignore untrusted SSL certificate (true/false)
   * @param schemaPath The path to the Json Schema
   * @param createFile Create a file for the Schema validation result? (true/false)
   * @param schemaValidationOutputFilePath If createFile is true, this will be the output path for the validation result file
   * @param headerDelimiter Which character to delimit the headers? (e.g '=' by default) */
  public static PostAction postAction(String body, String format, String filePath, String uri,
      String query, String headers, String expectedStatus, String jsonPath,
      boolean ignoreUntrustedCertificate, String schemaPath, boolean createFile,
      String schemaValidationOutputFilePath, String headerDelimiter) {
    return new PostAction(body,format,filePath,uri,query,headers,expectedStatus,jsonPath,ignoreUntrustedCertificate,schemaPath,createFile,schemaValidationOutputFilePath,headerDelimiter);
  }

  /**
   * HTTP PUT Request.  */
  public static class PutAction extends ActionProxy {
    /**
     * Request body (INPUT) */
    public String body;

    /**
     * Body format (INPUT) */
    public String format;

    /**
     * Local file path, if a file upload is required (e.g. C:\Test\test_file.txt) (INPUT) */
    public String filePath;

    /**
     * Endpoint URL (INPUT) */
    public String uri;

    /**
     * Query parameters (e.g. abc=123&efg=456) (INPUT) */
    public String query;

    /**
     * Request headers (default: h1=v1,h2=v2 (INPUT) */
    public String headers;

    /**
     * Expected response code (INPUT) */
    public String expectedStatus;

    /**
     * Jayway JsonPath (e.g. '$.key', see docs for more info) (INPUT) */
    public String jsonPath;

    /**
     * Server response body or value found using jsonPath specified (OUTPUT) */
    public String response;

    /**
     * Server response status code (OUTPUT) */
    public int status;

    /**
     * Value found using jsonPath in a form of a JSON object (OUTPUT) */
    public String jsonResponse;

    /**
     * Ignore untrusted SSL certificate (true/false) (INPUT) */
    public boolean ignoreUntrustedCertificate;

    /**
     * Response Headers (OUTPUT) */
    public String responseHeaders;

    /**
     * The path to the Json Schema (INPUT) */
    public String schemaPath;

    /**
     * Create a file for the Schema validation result? (true/false) (INPUT) */
    public boolean createFile;

    /**
     * If createFile is true, this will be the output path for the validation result file (INPUT) */
    public String schemaValidationOutputFilePath;

    /**
     * Which character to delimit the headers? (e.g '=' by default) (INPUT) */
    public String headerDelimiter;

    /**
     * Output of the schema validation (OUTPUT) */
    public String schemaValidationOutput;

    public PutAction() {
      this.setDescriptor(new ProxyDescriptor("Ujn6E4VbkEa6QU2XChYMyQ", "io.testproject.addon.restfulapiclient.actions.PutAction"));
    }

    public PutAction(String body, String format, String filePath, String uri, String query,
        String headers, String expectedStatus, String jsonPath, boolean ignoreUntrustedCertificate,
        String schemaPath, boolean createFile, String schemaValidationOutputFilePath,
        String headerDelimiter) {
      this();
      this.body = body;
      this.format = format;
      this.filePath = filePath;
      this.uri = uri;
      this.query = query;
      this.headers = headers;
      this.expectedStatus = expectedStatus;
      this.jsonPath = jsonPath;
      this.ignoreUntrustedCertificate = ignoreUntrustedCertificate;
      this.schemaPath = schemaPath;
      this.createFile = createFile;
      this.schemaValidationOutputFilePath = schemaValidationOutputFilePath;
      this.headerDelimiter = headerDelimiter;
    }
  }

  /**
   * HTTP PATCH Request.  */
  public static class PatchAction extends ActionProxy {
    /**
     * Request body (INPUT) */
    public String body;

    /**
     * Body format (INPUT) */
    public String format;

    /**
     * Local file path, if a file upload is required (e.g. C:\Test\test_file.txt) (INPUT) */
    public String filePath;

    /**
     * Endpoint URL (INPUT) */
    public String uri;

    /**
     * Query parameters (e.g. abc=123&efg=456) (INPUT) */
    public String query;

    /**
     * Request headers (default: h1=v1,h2=v2 (INPUT) */
    public String headers;

    /**
     * Expected response code (INPUT) */
    public String expectedStatus;

    /**
     * Jayway JsonPath (e.g. '$.key', see docs for more info) (INPUT) */
    public String jsonPath;

    /**
     * Server response body or value found using jsonPath specified (OUTPUT) */
    public String response;

    /**
     * Server response status code (OUTPUT) */
    public int status;

    /**
     * Value found using jsonPath in a form of a JSON object (OUTPUT) */
    public String jsonResponse;

    /**
     * Ignore untrusted SSL certificate (true/false) (INPUT) */
    public boolean ignoreUntrustedCertificate;

    /**
     * Response Headers (OUTPUT) */
    public String responseHeaders;

    /**
     * The path to the Json Schema (INPUT) */
    public String schemaPath;

    /**
     * Create a file for the Schema validation result? (true/false) (INPUT) */
    public boolean createFile;

    /**
     * If createFile is true, this will be the output path for the validation result file (INPUT) */
    public String schemaValidationOutputFilePath;

    /**
     * Which character to delimit the headers? (e.g '=' by default) (INPUT) */
    public String headerDelimiter;

    /**
     * Output of the schema validation (OUTPUT) */
    public String schemaValidationOutput;

    public PatchAction() {
      this.setDescriptor(new ProxyDescriptor("Ujn6E4VbkEa6QU2XChYMyQ", "io.testproject.addon.restfulapiclient.actions.PatchAction"));
    }

    public PatchAction(String body, String format, String filePath, String uri, String query,
        String headers, String expectedStatus, String jsonPath, boolean ignoreUntrustedCertificate,
        String schemaPath, boolean createFile, String schemaValidationOutputFilePath,
        String headerDelimiter) {
      this();
      this.body = body;
      this.format = format;
      this.filePath = filePath;
      this.uri = uri;
      this.query = query;
      this.headers = headers;
      this.expectedStatus = expectedStatus;
      this.jsonPath = jsonPath;
      this.ignoreUntrustedCertificate = ignoreUntrustedCertificate;
      this.schemaPath = schemaPath;
      this.createFile = createFile;
      this.schemaValidationOutputFilePath = schemaValidationOutputFilePath;
      this.headerDelimiter = headerDelimiter;
    }
  }

  /**
   * HTTP GET Request.  */
  public static class GetAction extends ActionProxy {
    /**
     * Request body (INPUT) */
    public String body;

    /**
     * Body format (INPUT) */
    public String format;

    /**
     * Endpoint URL (INPUT) */
    public String uri;

    /**
     * Query parameters (e.g. abc=123&efg=456) (INPUT) */
    public String query;

    /**
     * Request headers (default: h1=v1,h2=v2 (INPUT) */
    public String headers;

    /**
     * Expected response code (INPUT) */
    public String expectedStatus;

    /**
     * Jayway JsonPath (e.g. '$.key', see docs for more info) (INPUT) */
    public String jsonPath;

    /**
     * Server response body or value found using jsonPath specified (OUTPUT) */
    public String response;

    /**
     * Server response status code (OUTPUT) */
    public int status;

    /**
     * Value found using jsonPath in a form of a JSON object (OUTPUT) */
    public String jsonResponse;

    /**
     * Ignore untrusted SSL certificate (true/false) (INPUT) */
    public boolean ignoreUntrustedCertificate;

    /**
     * Response Headers (OUTPUT) */
    public String responseHeaders;

    /**
     * The path to the Json Schema (INPUT) */
    public String schemaPath;

    /**
     * Create a file for the Schema validation result? (true/false) (INPUT) */
    public boolean createFile;

    /**
     * If createFile is true, this will be the output path for the validation result file (INPUT) */
    public String schemaValidationOutputFilePath;

    /**
     * Which character to delimit the headers? (e.g '=' by default) (INPUT) */
    public String headerDelimiter;

    /**
     * Output of the schema validation (OUTPUT) */
    public String schemaValidationOutput;

    public GetAction() {
      this.setDescriptor(new ProxyDescriptor("Ujn6E4VbkEa6QU2XChYMyQ", "io.testproject.addon.restfulapiclient.actions.GetAction"));
    }

    public GetAction(String body, String format, String uri, String query, String headers,
        String expectedStatus, String jsonPath, boolean ignoreUntrustedCertificate,
        String schemaPath, boolean createFile, String schemaValidationOutputFilePath,
        String headerDelimiter) {
      this();
      this.body = body;
      this.format = format;
      this.uri = uri;
      this.query = query;
      this.headers = headers;
      this.expectedStatus = expectedStatus;
      this.jsonPath = jsonPath;
      this.ignoreUntrustedCertificate = ignoreUntrustedCertificate;
      this.schemaPath = schemaPath;
      this.createFile = createFile;
      this.schemaValidationOutputFilePath = schemaValidationOutputFilePath;
      this.headerDelimiter = headerDelimiter;
    }
  }

  /**
   * HTTP DELETE Request.  */
  public static class DeleteAction extends ActionProxy {
    /**
     * Request body (INPUT) */
    public String body;

    /**
     * Body format (INPUT) */
    public String format;

    /**
     * Endpoint URL (INPUT) */
    public String uri;

    /**
     * Query parameters (e.g. abc=123&efg=456) (INPUT) */
    public String query;

    /**
     * Request headers (default: h1=v1,h2=v2 (INPUT) */
    public String headers;

    /**
     * Expected response code (INPUT) */
    public String expectedStatus;

    /**
     * Jayway JsonPath (e.g. '$.key', see docs for more info) (INPUT) */
    public String jsonPath;

    /**
     * Server response body or value found using jsonPath specified (OUTPUT) */
    public String response;

    /**
     * Server response status code (OUTPUT) */
    public int status;

    /**
     * Value found using jsonPath in a form of a JSON object (OUTPUT) */
    public String jsonResponse;

    /**
     * Ignore untrusted SSL certificate (true/false) (INPUT) */
    public boolean ignoreUntrustedCertificate;

    /**
     * Response Headers (OUTPUT) */
    public String responseHeaders;

    /**
     * The path to the Json Schema (INPUT) */
    public String schemaPath;

    /**
     * Create a file for the Schema validation result? (true/false) (INPUT) */
    public boolean createFile;

    /**
     * If createFile is true, this will be the output path for the validation result file (INPUT) */
    public String schemaValidationOutputFilePath;

    /**
     * Which character to delimit the headers? (e.g '=' by default) (INPUT) */
    public String headerDelimiter;

    /**
     * Output of the schema validation (OUTPUT) */
    public String schemaValidationOutput;

    public DeleteAction() {
      this.setDescriptor(new ProxyDescriptor("Ujn6E4VbkEa6QU2XChYMyQ", "io.testproject.addon.restfulapiclient.actions.DeleteAction"));
    }

    public DeleteAction(String body, String format, String uri, String query, String headers,
        String expectedStatus, String jsonPath, boolean ignoreUntrustedCertificate,
        String schemaPath, boolean createFile, String schemaValidationOutputFilePath,
        String headerDelimiter) {
      this();
      this.body = body;
      this.format = format;
      this.uri = uri;
      this.query = query;
      this.headers = headers;
      this.expectedStatus = expectedStatus;
      this.jsonPath = jsonPath;
      this.ignoreUntrustedCertificate = ignoreUntrustedCertificate;
      this.schemaPath = schemaPath;
      this.createFile = createFile;
      this.schemaValidationOutputFilePath = schemaValidationOutputFilePath;
      this.headerDelimiter = headerDelimiter;
    }
  }

  /**
   * HTTP POST Request.  */
  public static class PostAction extends ActionProxy {
    /**
     * Request body (INPUT) */
    public String body;

    /**
     * Body format (INPUT) */
    public String format;

    /**
     * Local file path, if a file upload is required (e.g. C:\Test\test_file.txt) (INPUT) */
    public String filePath;

    /**
     * Endpoint URL (INPUT) */
    public String uri;

    /**
     * Query parameters (e.g. abc=123&efg=456) (INPUT) */
    public String query;

    /**
     * Request headers (default: h1=v1,h2=v2 (INPUT) */
    public String headers;

    /**
     * Expected response code (INPUT) */
    public String expectedStatus;

    /**
     * Jayway JsonPath (e.g. '$.key', see docs for more info) (INPUT) */
    public String jsonPath;

    /**
     * Server response body or value found using jsonPath specified (OUTPUT) */
    public String response;

    /**
     * Server response status code (OUTPUT) */
    public int status;

    /**
     * Value found using jsonPath in a form of a JSON object (OUTPUT) */
    public String jsonResponse;

    /**
     * Ignore untrusted SSL certificate (true/false) (INPUT) */
    public boolean ignoreUntrustedCertificate;

    /**
     * Response Headers (OUTPUT) */
    public String responseHeaders;

    /**
     * The path to the Json Schema (INPUT) */
    public String schemaPath;

    /**
     * Create a file for the Schema validation result? (true/false) (INPUT) */
    public boolean createFile;

    /**
     * If createFile is true, this will be the output path for the validation result file (INPUT) */
    public String schemaValidationOutputFilePath;

    /**
     * Which character to delimit the headers? (e.g '=' by default) (INPUT) */
    public String headerDelimiter;

    /**
     * Output of the schema validation (OUTPUT) */
    public String schemaValidationOutput;

    public PostAction() {
      this.setDescriptor(new ProxyDescriptor("Ujn6E4VbkEa6QU2XChYMyQ", "io.testproject.addon.restfulapiclient.actions.PostAction"));
    }

    public PostAction(String body, String format, String filePath, String uri, String query,
        String headers, String expectedStatus, String jsonPath, boolean ignoreUntrustedCertificate,
        String schemaPath, boolean createFile, String schemaValidationOutputFilePath,
        String headerDelimiter) {
      this();
      this.body = body;
      this.format = format;
      this.filePath = filePath;
      this.uri = uri;
      this.query = query;
      this.headers = headers;
      this.expectedStatus = expectedStatus;
      this.jsonPath = jsonPath;
      this.ignoreUntrustedCertificate = ignoreUntrustedCertificate;
      this.schemaPath = schemaPath;
      this.createFile = createFile;
      this.schemaValidationOutputFilePath = schemaValidationOutputFilePath;
      this.headerDelimiter = headerDelimiter;
    }
  }
}
