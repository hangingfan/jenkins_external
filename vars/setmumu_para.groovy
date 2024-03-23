def call(Map config = [:]){
    // Define the file path
    def filePath = "${config.projectpath}/ProjectSettings/ProjectSettings.asset"
    
    // Read the file content
    def fileContent = readFile(filePath)
    def keyword = 'AndroidTargetArchitectures: 2'
    def replacement = 'AndroidTargetArchitectures: 8'
    
    def modifiedContent = fileContent.replaceAll(keyword, replacement)
    writeFile(file: filePath, text: modifiedContent)
}
