def call(Map config = [:]){
    crash_upload_url = 'https://api.crashsight.qq.com/openapi/file/upload/symbol'
    crash_app_id_an = '1f05e4b565'
    crash_app_key_an = '868fc7d8-8891-4e9b-9f49-2435e842e7e1'
    crash_app_id_ios = '8d186edcb7'
    crash_app_key_ios = 'f65ae4e4-cefc-41e3-81de-285df2658ca1'
    if("${config.channel}".contains('apple_outside') || "${config.channel}".contains('googleplay'))
    {
        crash_upload_url = 'https://crashsight.wetest.net/openapi/file/upload/symbol'
        crash_app_id_an = 'e2c09c9257'
        crash_app_key_an = '2c4760e4-09c8-4463-801c-24aadac2d833'
        crash_app_id_ios = 'b3f332fe29'
        crash_app_key_ios = '99e1fdc8-a626-4272-83fb-49ea074c794c'
    }

    dir("${config.projectpath}/Build/tools/crashsight")
    {
        crashsight_command_ios = "java -jar crashSightSymbolTool.jar -id ${crash_app_id_ios} -key ${crash_app_key_ios} -package ${config.bundleid} -version ${config.package_v} -p ios -i ${config.projectpath}/Build/xcarchives/latest.xcarchive/dSYMs -d -u -channel ${config.channel} -url ${crash_upload_url}"
        crashsight_command_an = "java -jar crashSightSymbolTool.jar -id ${crash_app_id_an} -key ${crash_app_key_an} -package ${config.bundleid} -version ${config.package_v} -buildNo ${config.build_num} -p aos -i ${config.bugly_android_path} -d -u -channel ${config.channel} -url ${crash_upload_url}"
        if("${config.target}".contains('ios'))
        {
            sh(script: "${crashsight_command_ios}")
        }
        else
        {
            sh(script: "${crashsight_command_an}")
        }
    }
}
