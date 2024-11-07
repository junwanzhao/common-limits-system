import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import { resolve } from 'path'

// https://vite.dev/config/
export default defineConfig({
  plugins: [vue()],
  server: {
    host: '0.0.0.0', //解决“vite use `--host` to expose”  ,允许从外部访问开发服务器
    port: 8080, //指定开发服务器运⾏的端⼝
    open: true //在启动开发服务器时⾃动打开默认浏览器
  },
  resolve: {
    alias: [
      {
        find: '@',
        replacement: resolve(__dirname, 'src')
      }
    ]
  }
})
