import { createApp } from 'vue'
import App from './App.vue'
import router from './router/index'

//引⼊element plus
import ElementPlus from 'element-plus'
//国际化
import zhCn from 'element-plus/es/locale/lang/zh-cn'
import 'element-plus/dist/index.css'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

//引⼊Pinia构造函数
import { createPinia } from 'pinia'
import piniaPersist from 'pinia-plugin-persist'
// 实例化 Pinia
const pinia = createPinia()
//使⽤持久化插件
pinia.use(piniaPersist)

const app = createApp(App)
app
  .use(router)
  .use(ElementPlus, {
    locale: zhCn
  })
  .use(pinia)
  .mount('#app')

//全局注册图标组件
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
  app.component(key, component)
}
