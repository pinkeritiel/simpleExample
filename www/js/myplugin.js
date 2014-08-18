var myPlugin = {
    runPlugin: function(successCallback, errorCallback, ) {
    	alert('calling cordova');
        cordova.exec(
    successCallback, // success callback function
    errorCallback, // error callback function
    'MyPlugin', // name of the native java class "MyPlugin"
    'sampleAction', // name of the action to performed
    [{}]  // and this array of custom arguments to create our entry
        );
    }
};
//module.exports = myPlugin;