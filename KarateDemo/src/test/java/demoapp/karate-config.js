import karate from "./Chart.min";

function fn() {
  let env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  karate.configure('driver', { type: 'chrome', executable: 'C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe' });
  karate.log("Selected Chrome");
  if (!env) {
    env = 'dev';
  }
  var config = {
    env: env,
    myVarName: 'someValue'
  }
  if (env === 'dev') {
    // customize
    // e.g. config.foo = 'bar';
  } else if (env === 'e2e') {
    // customize
  }
  return config;
}