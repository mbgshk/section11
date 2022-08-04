import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Lenovo\\git\\section11\\MobileApp\\HappyDayShopping.apk', true)

Mobile.tap(findTestObject('Object Repository/FlashSale/flash-sale_menu'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSale/flash-sale_product'), 0)

Mobile.setText(findTestObject('Object Repository/FlashSale/quantity_product'), '5', 0)

Mobile.tap(findTestObject('Object Repository/FlashSale/add-to-bag_button'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSale/your-bag_menu'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSale/checkout_button'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSale/more_button'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSale/browser_icon'), 0)

Mobile.getText(findTestObject('Object Repository/FlashSale/text_assertions'), 
    0)

Mobile.closeApplication()

