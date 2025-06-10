package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader


// (1) try catch finally 구문

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    // if-else 처럼 하나로 동작할 수 있다. (expression)
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// (2) CheckedException 과 UncheckedException 파일 읽기
/*
Checked, Unchecked 구분하지 않는다. 모두 UncheckedException
 */
fun readFile() { // throws 체크하지 않음
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// (3) try with resources ex)프로젝트 내 파일 내용물 읽어오기
/*
try with resources 구문 존재하지 않음
BufferedReader 의 확장 함수를 사용해 처리할 수 있다. (use) inline 함수
 */
fun readFileV2(path: String) {
    BufferedReader(FileReader(path)).use { br ->
        println(br.readLine())
    }
}














