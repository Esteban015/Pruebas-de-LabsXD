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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/')

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'Mercado libre')

WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input__q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Mercado libre - Buscar con Google/h3_Mercado Libre Argentina - Envos Gratis en el da'))

WebUI.click(findTestObject('Object Repository/Page_Mercado Libre Argentina - Envos Gratis_138d3c/button_Entendido'))

WebUI.click(findTestObject('Page_Categoras y Secciones en Mercado Libre/a_Categoras'))

WebUI.click(findTestObject('Object Repository/Page_Mercado Libre Argentina - Envos Gratis_138d3c/a_Moda'))

WebUI.click(findTestObject('Object Repository/Page_Ropa y Accesorios en Mercado Libre Argentina/img_Zapatilla Addict De Pu Mujer 47 Street__2c91a9'))

WebUI.delay(2)

WebUI.closeBrowser()

