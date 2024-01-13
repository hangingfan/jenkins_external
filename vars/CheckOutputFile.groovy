def call(Map config = [:]){
    dir(output_path)
    {
        docFiles = findFiles(glob: "${config.cur_suffix}")
        if (docFiles.size() == 0)
        {
            uploadAfterFailed()
            error("${config.cur_suffix} not found, aborted the jobs")
        }
    }
}
