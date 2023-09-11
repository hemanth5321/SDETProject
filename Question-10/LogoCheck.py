from selenium import webdriver
from selenium.webdriver.common.by import By
import unittest

class MyTestCase(unittest.TestCase):

    def test_logo(self):
        driver = webdriver.Chrome()
        driver.get("https://www.w3schools.com/")
        element = driver.find_element(By.XPATH, "//*[@id='w3-logo']/i")
        self.assertNotEqual(element, None)
        driver.quit()

if __name__ == '__main__':
    unittest.main()
