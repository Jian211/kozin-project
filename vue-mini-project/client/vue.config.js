const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  outputDir: "../src/main/resources/static",
  // indexPath: "../static/index.html",
  devServer: {
    proxy: {
      "/api": {
        target: "http://localhost:8088",
        changeOrigin: true
      }
    }
  },
  chainWebpack: config =>{
    const svgRule = config.module.rule('svg');
    svgRule.uses.clear();
    svgRule.use("vue-svg-loader").loader("vue-svg=loader");
  }
})
