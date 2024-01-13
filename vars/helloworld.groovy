def call(Map config = [:]){
    record_path ="${config.projectpath}/Build/error_record.txt"
    if (fileExists ("${config.record_path}")) 
    {
        error_content = readFile(file: "${config.record_path}")
        error_content = error_content.replaceAll("\n", "\\\\n")
        return error_content
    }
    return ""
}
