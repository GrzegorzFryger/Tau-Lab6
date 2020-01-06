*** Test Cases ***
Should detect a triangle when 3 sides are equal
    ${result} =  Run Java Class With Args  ${mainClass}   3 3 3
    Should be equal as strings     ${result.replace("\n", " ")}   Mozna zbudowac trojkat

Should detect a equilateral triangle when all sides are equals
    ${result} =  Run Java Class With Args  ${mainClass}   3 3 3
    Should be equal as strings    ${result.replace("\n", " ")}   Mozna zbudowac trojkat rownoboczny

Should detect a triangle when 2 sides are equals
    ${result} =  Run Java Class With Args  ${mainClass}   2 2 3
    Should be equal as strings     ${result.replace("\n", " ")}   Mozna zbudowac trojkat

Should detect a isosceles triangle when 2 sides are equals
    ${result} =  Run Java Class With Args  ${mainClass}   2 2 3
    Should be equal as strings    ${result.replace("\n", " ")}   Mozna zbudowac prostokat rownoramienny

Should not detect a triangle when 3 sides are smaller than 3
    ${result} =  Run Java Class With Args  ${mainClass}   1 2 3
    Should be equal as strings     ${result.replace("\n", " ")}   nierozpoznano

Should detect a square and renctangle when 4 sides are equals
    ${result} =  Run Java Class With Args  ${mainClass}   2 2 2 2
    Should be equal as strings     ${result.replace("\n", " ")}   Mozna zbudowac prostokat Mozna zbudowac kwadrat

Should detect a rectangle when 2 sides are equals
    ${result} =  Run Java Class With Args  ${mainClass}   2 2 4 4
    Should be equal as strings     ${result.replace("\n", " ")}   Mozna zbudowac prostokat

Should detect a quadrangle when all sides are diffrent
    ${result} =  Run Java Class With Args  ${mainClass}   3 2 3 4
    Should be equal as strings    ${result.replace("\n", " ")}   Mozna zbudowac czworkat

*** Settings ***
Documentation   Test figures
Library         OperatingSystem

*** Variables ***
${SRC_PATH}    %{user.dir}\\target\\classes\\
${mainClass}    pl.edu.pja.tau.lab6.Main

*** Keywords ***
Check Path
    [Arguments]  ${class_name}  ${output}=${SRC_PATH}${class_name}
    Log     Running: ${output}
    [return]    ${output}

Run Java Class
    [Arguments]  ${class_name}  ${path}=${SRC_PATH}
    ${output}=   Run    java -cp ${path} ${class_name}
    Log     ${output}
   [return]    ${output}

Run Java Class With Args
    [Arguments]  ${class_name}  ${args}     ${path}=${SRC_PATH}
    ${output}=   Run    java -cp ${path} ${class_name} ${args}
    Log     ${output}
    [return]    ${output}
