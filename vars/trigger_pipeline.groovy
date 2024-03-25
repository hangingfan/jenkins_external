def call(Map config = [:]){
    enable_perf_type = '0'
    if("${config.auto_trigger}".contains('PhoneProfile'))
    {
        enable_perf_type = '1'
    }

    serial = "R5CR11VKZ8W"
    platform = "android"
    token = "5a0Pd1KoLiFUDUaS"

    if("${config.target}".contains('ios'))
    {
        serial = "00008110-0008389C0E01401E"
        platform = "ios"
    }

    dir("${projectpath}/Build/tools/autopipeline")
    {
        sh(script: """python3 run.py --package_path ${config.triggerPackagePath} --serial ${serial} --classify_perf ${config.classifyPerf} --platform ${platform} --package_version ${config.curfileName}  --enable_perf_type ${enable_perf_type} --bundle_id ${config.bundleid} --token ${token}""", returnStdout: true).trim()
    }
}
