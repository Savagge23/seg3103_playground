# Seg3103_playground Lab2
This project was designed to test the TC's for exercise with the registration tool. The TC's for exercise 1 can be seen in the table down below and the screenshot of the results of these TC's can be seen in the directory Screenshots with the respective screenshots labeled based upon the TC's. For exercise 2 the goal was to develop parameterized tests for DateNextDateExceptionTest.java and DateNextDateOkTest.java with all the tests successfully passing. 

| Test Case | Expected results | Actual Results | Verdict |
| --- | --- | --- | --- |
| TC1: UserName("abc") | Error | Error | Pass |
| TC2: UserName("Luka77") | Successful Registration | Successful Registration | Pass |
| TC3: UserName("LukaDoncic77") | Successful Registration | Successful Registration | Pass |
| TC4: UserName("AnthonyEdwards") | Error | Error | Pass |
| TC5: UserName("77Luka") | Error | Error | Pass |
| TC6: UserName("Luka77!") | Error | Error | Pass |
| TC7: FirstName("Harjot") | Successful Registration | Successful Registration | Pass |
| TC8: FirstName("") | Successful Registration | Successful Registration | Pass |
| TC9: FirstName("Harjot23") | Error | Error | Pass |
| TC10: LastName("Sandhu") | Successful Registration | Successful Registration | Pass |
| TC11: LastName("") | Successful Registration | Successful Registration | Pass |
| TC12: LastName("Sandhu19") | Error | Error | Pass |
| TC13: Age() | Error | Error | Pass |
| TC14: Age("aa") | Error | Error | Pass |
| TC15: Age(17) | Error | Error | Pass |
| TC16: Age(18) | Successful Registration | Successful Registration | Pass |
| TC17: Age(64) | Successful Registration | Successful Registration | Pass |
| TC18: Age(65) | Error | Error | Pass |
| TC19: Email("") | Error | Error | Pass |
| TC20: Email("hdhdh@hdhdhd") | Error | Error | Pass |
| TC21: Email("hdhdh@hdhdhd.") | Error | Error | Pass |
| TC22: Email("hdhdh@hdhdhd.c") | Error | Error | Pass |
| TC23: Email("hdhdh@hdhdhd.co") | Successful Registration | Successful Registration | Pass |
| TC24: City(Halifax) | Successful Registration | Successful Registration | Pass |
| TC25: PostalCode("L6X4L9") | Successful Registration | Successful Registration | Pass |
| TC26: PostalCode("12K53V") | Successful Registration | Successful Registration | Pass |
| TC27: PostalCode("") | Error | Error | Pass |
