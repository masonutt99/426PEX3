:: Creates a Variable for the Output File
@SET file="pex_test_results.txt"

:: Erases Everything Currently In the Output File
type NUL>%file%

:: ----------------------------------------
:: TITLE
:: ----------------------------------------
echo TEST CASES - Lee / Utt >> %file%
echo. >> %file%

:: ----------------------------------------
:: GOOD EXAMPLES
:: ----------------------------------------
echo RUNNING GOOD EXAMPLES >> %file%
echo Testing Assignments >> %file%
bin\Debug\ConsoleApplication.exe testcases\pex3\assignment.txt >> %file%
echo. >> %file%

echo Testing Constants >> %file%
bin\Debug\ConsoleApplication.exe testcases\pex3\constants.txt >> %file%
echo. >> %file%

echo Testing Expressions >> %file%
bin\Debug\ConsoleApplication.exe testcases\pex3\expressions.txt >> %file%
echo. >> %file%

echo Testing Parameters >> %file%
bin\Debug\ConsoleApplication.exe testcases\pex3\parameters.txt >> %file%
echo. >> %file%



:: ----------------------------------------
:: BAD EXAMPLES
:: ----------------------------------------
echo. >> %file%
echo RUNNING BAD EXAMPLES >> %file%
echo Testing Re-Declaration >> %file%
bin\Debug\ConsoleApplication.exe testcases\pex3\redeclarations.txt >> %file%
echo. >> %file%


pause