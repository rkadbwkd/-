package hello.core.member;

public class MemberSerivceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository(); // CTRL + SHIFT + ENTFER


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}