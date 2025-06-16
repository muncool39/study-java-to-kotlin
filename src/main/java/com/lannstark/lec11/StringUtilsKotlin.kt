package com.lannstark.lec11

// 유틸성 코드 작성
fun isDirectoryPath(path:String):Boolean{
    return path.endsWith("/")
}