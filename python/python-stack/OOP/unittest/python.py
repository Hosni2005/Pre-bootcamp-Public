# import the Python testing framework
import unittest

# function we are testing
def isEqual(x, y):
    if x / y == y / x:
        return "they are equal"
    else:
        return "they arent equal"


# unit tests
class IsEqualTests(unittest.TestCase):

    def testEqual(self):
        self.assertEqual(isEqual(2, 2), "they are equal")

        # another way
        self.assertTrue(isEqual(2, 2) == "they are equal")

    def testNotEqual(self):
        self.assertEqual(isEqual(3, 4), "they arent equal")

        # another way
        self.assertFalse(isEqual(1, 1) == "they arent equal")

    # runs before each test
    def setUp(self):
        print("hi")

    # runs after each test
    def tearDown(self):
        print("hello")


if __name__ == '__main__':
    unittest.main()