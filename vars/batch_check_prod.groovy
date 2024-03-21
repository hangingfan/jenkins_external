def call(Map config = [:]){
    if("${config.batch_channel}".contains('安卓批量_withboard'))
    {
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'official_android', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'bilibili', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'huawei', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'oceanengine', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'taptap', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'haoyoukuaibao', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'mumu', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')

        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'preofficial_android', buildtype:'debug_不加壳', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'quicktest', origin_package:'0')

        currentBuild.result = 'ABORTED'
        error('Manually aborted due to 批量任务')
    }
    else if("${config.batch_channel}".contains('安卓批量'))
    {
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'official_android', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'bilibili', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'huawei', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'oceanengine', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'taptap', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'haoyoukuaibao', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'mumu', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')

        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'preofficial_android', buildtype:'debug_不加壳', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'quicktest', origin_package:'0')


        currentBuild.result = 'ABORTED'
        error('Manually aborted due to 批量任务')
    }
    else if("${config.batch_channel}".contains('google批量_withboard'))
    {
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'googleplay', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'pregoogleplay', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')

        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'googleplay', buildtype:'debug_不加壳', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'quicktest', origin_package:'0')

        currentBuild.result = 'ABORTED'
        error('Manually aborted due to 批量任务')
    }
    else if("${config.batch_channel}".contains('google批量'))
    {
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'googleplay', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'pregoogleplay', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')

        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'googleplay', buildtype:'debug_不加壳', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'quicktest', origin_package:'0')

        currentBuild.result = 'ABORTED'
        error('Manually aborted due to 批量任务')
    }
    else if("${config.batch_channel}".contains('批量official_ios'))
    {
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'official_ios', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'preofficial_ios', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'official_ios', buildtype:'debug', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'quicktest', origin_package:'0')

        currentBuild.result = 'ABORTED'
        error('Manually aborted due to 批量任务')
    }
    else if("${config.batch_channel}".contains('批量official_ios_withboard'))
    {
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'official_ios', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'preofficial_ios', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'official_ios', buildtype:'debug', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'quicktest', origin_package:'0')

        currentBuild.result = 'ABORTED'
        error('Manually aborted due to 批量任务')
    }
    else if("${config.batch_channel}".contains('批量apple_outside'))
    {
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'apple_outside', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'preapple_outside', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'apple_outside', buildtype:'debug', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'quicktest', origin_package:'0')

        currentBuild.result = 'ABORTED'
        error('Manually aborted due to 批量任务')
    }
    else if("${config.batch_channel}".contains('批量apple_outside_withboard'))
    {
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'apple_outside', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'preapple_outside', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'apple_outside', buildtype:'debug', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'quicktest', origin_package:'0')

        currentBuild.result = 'ABORTED'
        error('Manually aborted due to 批量任务')
    }
    else if("${config.batch_channel}" == 'None' && "${config.channel}" == '0')
    {
        currentBuild.result = 'ABORTED'
        error('参数错误')
    }
}
