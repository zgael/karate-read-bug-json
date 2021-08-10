function fn() {
  // var config={}
  var config = read('test.json')
  config.displayMap=Java.type('examples.Helper').displayMap
  config.displayMap({"animals": ["Beethoven", "Lassie"]})
  return config;
}