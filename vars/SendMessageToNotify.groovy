def call(Map config = [:]){
    httpRequest contentType: 'APPLICATION_JSON_UTF8', customHeaders:
    [
        [
            maskValue: false,
            name: 'Access-Token', value: 'dJ1row480rPn3lf0'
        ]
    ],
    httpMode: 'POST',
    ignoreSslErrors: true,
    requestBody: """
    {
        "robotKey": "${robotKey}",
        "data":
        {
            "title": {
                "name": "${config.content}",
                "template": "${config.colorcontent}"
            },
            "content": {
                "absize": "${absize}",
                "author": "${author}",
                "serverIp": "${serverIp}",
                "p4workspace": "${p4workspace}",
                "shelve_version": "${shelve_version}",
                "newest_version": "${newestVersion}",
                "filename": "${curfileName}",
                "error_record": "${GetErrorContent(projectpath:"${projectpath}")}"
            }
        }
    }""",
    responseHandle: 'NONE',
    url: "${config.url}",
    wrapAsMultipart: false
}
