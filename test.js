const chrome = require("selenium-webdriver/chrome");
const { Builder, By, Key, until } = require("selenium-webdriver");

(async function googleSearch() {
  let driver = await new Builder()
    .forBrowser("chrome")
    .usingServer("http://43.205.138.221:4444/wd/hub/")
    // .setChromeService(
    //  chrome.setDefaultService(
    //    new chrome.ServiceBuilder("./drivers/chromedriver_89").build()
    //  )
    //)
    .build();

  try {
    // Navigate to Url
    await driver.get("https://www.google.com");
    // Enter text "Automation Bro" and perform keyboard action "Enter"
    await driver
      .findElement(By.name("q"))
      .sendKeys("Automation Bro", Key.ENTER);

    let firstResult = await driver.wait(
      until.elementLocated(By.css("h3")),
      10000
    );

    console.log(await firstResult.getAttribute("textContent"));
    console.log(await (await driver.getCapabilities()).getBrowserName());
    console.log(await (await driver.getCapabilities()).getBrowserVersion());
  } finally {
    driver.quit();
  }
})();
