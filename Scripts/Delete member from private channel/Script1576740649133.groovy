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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermost-usecase.herokuapp.com')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'bannnnn')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), '6M8jdlTs8n6rOnocPaG5Cw==')

WebUI.click(findTestObject('Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Page_Town Square - test-case Mattermost/span_Test create private channel'))

WebUI.click(findTestObject('Page_Test create private channel - test-cas_2f9e36/span_Invite others to this private channel'))

WebUI.click(findTestObject('Object Repository/Private channel/Delete member from private channel/Page_Test create private channel - test-cas_2f9e36/div_h13uct'))

WebUI.click(findTestObject('Page_Test create private channel - test-cas_2f9e36/span_Add'))

WebUI.click(findTestObject('Object Repository/Private channel/Delete member from private channel/Page_Test create private channel - test-cas_2f9e36/div_2'))

WebUI.click(findTestObject('Page_Test create private channel - test-cas_2f9e36/span_Manage Members'))

WebUI.click(findTestObject('Page_Test create private channel - test-cas_2f9e36/span_Remove Member'))

WebUI.click(findTestObject('Page_Test create private channel - test-cas_2f9e36/span_'))

WebUI.closeBrowser()

