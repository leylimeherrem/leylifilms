package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Page {

    protected WebDriver webDriver;

    By portfolio = By.xpath("//*[@id=\"comp-krge0j68\"]/nav/ul/li[2]/a/div/span");
    By aboutMe = By.xpath("//*[@id=\"comp-krge0j68\"]/nav/ul/li[3]/a/div/span");
    By pricing = By.xpath("//*[@id=\"comp-krge0j68\"]/nav/ul/li[4]/a/div/span");

    public PortfolioPage clickPage() {
        webDriver.findElement(portfolio).click();
        return new PortfolioPage();
    }

    public AboutMePage clickAboutMePage() {
        webDriver.findElement(aboutMe).click();
        return new AboutMePage();
    }

    public PricingPage clickPricingPage() {
        webDriver.findElement(pricing).click();
        return new PricingPage();
    }

}
