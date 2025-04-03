<template>
  <div class="card card-body"></div>
  <h2>Video Player</h2>
</template>
<script setup>
import {ref } from 'vue'
import  {useRoute, useRouter} from 'vue-router'

const videos = inject('videos')

const currentRoute = useRoute()
const router = useRouter()

// 경로 아이디로 현재 선택된 비디오 객체 찾아오기
const videoInfo = reactive({
    video: videos.find((v)=> v.id===currentRoute.params.id)
})
const stopVideo = ()=>{

    playerRef.value.player.stopVideo()
    router.push({name: 'videos'})


} 
const playNext = ()=>{
    const index = videos.findIndex((v)=> v.iv === currentRoute.params.id)
    const nextVideo = videos[index +1]

    if(nextVideo){
        
    }
}


</script>
