def call(Map config = [:]){
    record_path ="${config.projectpath}/Build/error_record.txt"
    if (fileExists ("${record_path}")) 
    {
        error_content = readFile(file: "${record_path}")
        error_content = error_content.replaceAll("\n", "\\\\n")
        return error_content
    }
    return ""
}
