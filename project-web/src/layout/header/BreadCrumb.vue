<template>
  <el-breadcrumb class="bred" separator="/">
    <el-breadcrumb-item v-for="(item, index) in tabs" :key="index">
      {{ item.meta.title }}
    </el-breadcrumb-item>
  </el-breadcrumb>
</template>
<script setup lang="ts">
import { ref, Ref, watch } from 'vue'
import { useRoute, RouteLocationMatched } from 'vue-router'
const route = useRoute()
//定义⾯包屑导航数据
const tabs: Ref<RouteLocationMatched[]> = ref([])
//获取⾯包屑数据
const getBredcrumb = () => {
  let mached = route.matched.filter((item) => item.meta && item.meta.title)
  //获取第⼀个数据
  const first = mached[0]
  //判断是否是⾸⻚，不是，⾃⼰构造
  if (first.path !== '/dashboard') {
    mached = [{ path: '/dashboard', meta: { title: '⾸⻚' } } as any].concat(
      mached
    )
  }
  tabs.value = mached
}
getBredcrumb()
//监听当前路由
watch(
  () => route.path,
  () => getBredcrumb()
)
</script>
<style scoped lang="scss">
.bred {
  margin-left: 20px;
}
//修改字体颜⾊
:deep(.el-breadcrumb__inner) {
  color: #fff !important;
}
:deep(.el-breadcrumb__inner a) {
  color: #fff !important;
}
// 修改字体⼤⼩
:deep(.el-breadcrumb__item) {
  font-size: 16px !important;
}
</style>
