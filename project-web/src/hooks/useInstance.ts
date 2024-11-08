// 导⼊ Vue 的 `getCurrentInstance` 函数和 `ComponentInternalInstance` 类型， ⽤于获取当前组件实例
import { getCurrentInstance, ComponentInternalInstance } from 'vue'
// 定义并导出⼀个⾃定义的钩⼦函数 `useInstance`，⽤于在 Vue 3 组合式 API 中访问当前 组件的实例
export default function useInstance() {
  // 使⽤ `getCurrentInstance()` 获取当前组件实例，并将其断⾔为 `ComponentInternalInstance` 类型，
  // 以便在后续访问该实例的属性时具有类型⽀持
  const { appContext, proxy } =
    getCurrentInstance() as ComponentInternalInstance
  // 从 `appContext.config` 中获取全局属性（`globalProperties`）,
  // 这样可以访问整个应⽤程序范围内定义的全局属性和⽅法
  const global = appContext.config.globalProperties
  // 返回⼀个对象，包含组件实例的 `proxy` 和全局属性 `global`
  // `proxy` 指向当前组件实例的代理对象，可以⽤于访问组件中的数据、⽅法等
  // `global` 指向应⽤的全局属性
  return {
    proxy,
    global
  }
}
